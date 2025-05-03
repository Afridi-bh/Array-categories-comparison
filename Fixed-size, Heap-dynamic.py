import ctypes

def fixed_heap_dynamic_array():
    size = 5
    ArrayType = ctypes.c_int * size  # fixed-size array on heap
    arr = ArrayType()
    for i in range(size):
        arr[i] = i * 2
    print("Fixed Heap Dynamic:", list(arr))

fixed_heap_dynamic_array()
