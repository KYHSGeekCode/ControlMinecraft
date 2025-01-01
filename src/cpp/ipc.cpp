#include <pybind11/pybind11.h>
#include "ipc.h"
#define MACRO_STRINGIFY(x) #x

#ifdef __APPLE__

#include "ipc_apple.h"
py::object
initialize_from_mach_port(unsigned int machPort, int width, int height) {
    return mtl_tensor_from_mach_port(machPort, width, height);
}
py::object mtl_tensor_from_cuda_mem_handle(
    const char *cuda_ipc_handle, int width, int height
) {
    return py::none();
}

#elif __CUDA__
#include "ipc_cuda.h"
py::object initialize_from_mach_port(int machPort, int width, int height) {
    return py::none();
}

py::object mtl_tensor_from_cuda_mem_handle(
    const char *cuda_ipc_handle, int width, int height
) {
    DLManagedTensor *tensor = mtl_tensor_from_cuda_ipc_handle(
        const_cast<void *>(cuda_ipc_handle), width, height
    );

    if(!tensor) {
        throw std::runtime_error("Failed to create DLManagedTensor from CUDA IPC handle");
    }
    
    PyObject *capsule = PyCapsule_New(
        tensor,
        "dltensor",
        [](PyObject *capsule) {
            DLManagedTensor *tensor =
                (DLManagedTensor *)PyCapsule_GetPointer(capsule, "dltensor");
            if (tensor) {
                tensor->deleter(tensor);
            }
        }
    );
    if (!capsule) {
        throw std::runtime_error("Failed to create PyCapsule for DLManagedTensor");
    }
    return py::reinterpret_steal<py::object>(capsule);
}

#else
py::object
initialize_from_mach_port(unsigned int machPort, int width, int height) {
    return py::none();
}

py::object mtl_tensor_from_cuda_mem_handle(
    const char *cuda_ipc_handle, int width, int height
) {
    return py::none();
}
#endif

PYBIND11_MODULE(craftground_native, m) {
    m.doc() = "Craftground Native Module";
    m.def("initialize_from_mach_port", &initialize_from_mach_port);
    m.def("mtl_tensor_from_cuda_mem_handle", &mtl_tensor_from_cuda_mem_handle);

#ifdef VERSION_INFO
    m.attr("__version__") = MACRO_STRINGIFY(VERSION_INFO);
#else
    m.attr("__version__") = "dev";
#endif
}
