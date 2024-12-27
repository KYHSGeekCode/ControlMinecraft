#ifndef __IPC_CUDA_H__
#define __IPC_CUDA_H__

#include <cuda_runtime.h>
#include "dlpack.h"
DLManagedTensor* mtl_tensor_from_cuda_ipc_handle(void *cuda_ipc_handle, int width, int height);

#endif // __IPC_CUDA_H__