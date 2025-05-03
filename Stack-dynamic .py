def stack_dynamic_array(size):
    arr = [None] * size  # runtime size from function input
    for i in range(size):
        arr[i] = i + 1
    print("Stack Dynamic:", arr)

stack_dynamic_array(7)


