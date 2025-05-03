def heap_dynamic_array():
    arr = []  # dynamic and heap allocated
    for i in range(10):
        arr.append(i * 3)  # can grow at runtime
    print("Heap Dynamic:", arr)

heap_dynamic_array()
