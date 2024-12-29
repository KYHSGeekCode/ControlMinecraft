#include <CoreGraphics/CoreGraphics.h>
#import <Foundation/Foundation.h>
#import <Metal/Metal.h>
#define GL_SILENCE_DEPRECATION
#include <OpenGL/OpenGL.h>
#include <OpenGL/gl.h>
#include <servers/bootstrap.h>


#include "framebuffer_capturer_apple.h"

IOSurfaceRef createSharedIOSurface(int width, int height) {
    NSDictionary *surfaceAttributes = @{
        (id)kIOSurfaceWidth : @(width),
        (id)kIOSurfaceHeight : @(height),
        (id)kIOSurfaceBytesPerElement : @(4),     // RGBA8
        (id)kIOSurfacePixelFormat : @(0x42475241) // 'RGBA'
    };

    return IOSurfaceCreate((CFDictionaryRef)surfaceAttributes);
}

static mach_port_t createMachPortForIOSurface(IOSurfaceRef ioSurface, int python_pid) {
    kern_return_t result;
    mach_port_t machPort = MACH_PORT_NULL;
    machPort = IOSurfaceCreateMachPort(ioSurface);
    if (machPort == MACH_PORT_NULL) {
        fprintf(stderr, "Failed to create Mach Port\n");
        return -1;
    }
    // Check the Mach Port type for debugging
    mach_port_type_t portType;
    result = mach_port_type(mach_task_self(), machPort, &portType);
    if (result == KERN_SUCCESS) {
        printf("Mach Port type: 0x%x\n", portType);
    } else {
        fprintf(stderr, "Failed to get Mach Port type: %s\n", mach_error_string(result));
        return -1;
    }

    // Insert the Mach Port right to the Python process
    task_t python_task;
    result = task_for_pid(mach_task_self(), python_pid, &python_task);
    if (result != KERN_SUCCESS) {
        fprintf(stderr, "Failed to get task port for Python process: %s\n", mach_error_string(result));
        return -1;
    }

    result = mach_port_insert_right(python_task, machPort, machPort, MACH_MSG_TYPE_COPY_SEND);
    if (result != KERN_SUCCESS) {
        fprintf(stderr, "Failed to insert Mach Port right: %s\n", mach_error_string(result));
    } else {
        printf("Successfully shared Mach Port with Python process\n");
    }

    // If we want it need not send mach port to another process. However this requires launchd
    // result = bootstrap_check_in(machPort, "com.yhs0602.craftground.machport", &machPort);
    // if (result != KERN_SUCCESS) {
    //     fprintf(stderr, "Failed to register Mach Port: %s\n", mach_error_string(result));
    // }
    return machPort;
}

static IOSurfaceRef ioSurface;
static bool initialized = false;
static GLuint textureID;

// TODO: Depth buffer
int initializeIoSurface(int width, int height, void **return_value, int python_pid) {
    if (initialized) {
        return 0;
    }

    // If were to use colorAttachment and depthAttachment, they
    // should be first converted to GL_TEXTURE_RECTANGLE_ARB, from GL_TEXTURE_2D
    // Therefore, use glCopyTexSubImage2D to copy the contents of the
    // framebuffer to ARB textures

    // Generate a texture
    glGenTextures(1, &textureID);
    ioSurface = createSharedIOSurface(width, height);
    mach_port_t machPort = createMachPortForIOSurface(ioSurface, python_pid);
    printf("\n\nmachPort: %u\n\n\n", machPort);
    fflush(stdout);
    glBindTexture(GL_TEXTURE_RECTANGLE_ARB, textureID);
    CGLContextObj cglContext = CGLGetCurrentContext();
    CGLTexImageIOSurface2D(
        cglContext,
        GL_TEXTURE_RECTANGLE_ARB,
        GL_RGBA,
        width,
        height,
        GL_BGRA,
        GL_UNSIGNED_INT_8_8_8_8_REV,
        ioSurface,
        0
    );
    initialized = true;
    const int size = sizeof(machPort);
    void *bytes = malloc(size);
    if (bytes == NULL) {
        return -1;
    }
    memcpy(bytes, &machPort, size);
    *return_value = bytes;
    return size;
}

void copyFramebufferToIOSurface(int width, int height) {
    glBindTexture(GL_TEXTURE_RECTANGLE_ARB, textureID);
    glCopyTexSubImage2D(GL_TEXTURE_RECTANGLE_ARB, 0, 0, 0, 0, 0, width, height);
}