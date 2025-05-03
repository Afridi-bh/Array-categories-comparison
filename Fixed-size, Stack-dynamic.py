def fixed_stack_dynamic_array():
    size = 5  # fixed size known at function runtime
    arr = [0] * size  # stack-dynamic in concept
    for i in range(size):
        arr[i] = i * 10
    print("Fixed Stack Dynamic:", arr)

fixed_stack_dynamic_array()

