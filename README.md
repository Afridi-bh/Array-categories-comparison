Array Categories in Java and Python
This repository demonstrates 4 categories of arrays used in Java and Python, showcasing the differences and similarities between the two languages in terms of stack vs heap memory, fixed size vs dynamic resizing, and how arrays are allocated in memory.

Table of Contents
Introduction

Array Categories

Code Examples

Java Examples

Python Examples

Java vs Python Comparison

Contributions

Introduction
In this repository, we explore 4 types of array categories based on how they manage memory and allocate space. We will examine Java and Python implementations for each of these categories.

Array Categories
There are 4 categories of arrays, and they are:

✅ 1. Fixed-size, Stack-Dynamic Array
Description: The size is determined during execution (runtime), but it cannot be changed after creation. The array is allocated in the method/block, simulating stack-based behavior.

Languages: Both Java and Python simulate this by creating arrays inside functions.

✅ 2. Stack-Dynamic Array
Description: The array is also created at runtime, typically with a size passed as a parameter.

Languages: This is simulated in both Java and Python by creating arrays inside methods and passing the size as a parameter.

✅ 3. Fixed-size, Heap-Dynamic Array
Description: The array has a fixed size that is known at runtime, but it is allocated on the heap. Its size cannot change after allocation.

Languages: In Java, arrays are always on the heap. Python uses array.array() or tuple for fixed-size arrays.

✅ 4. Heap-Dynamic (Resizable) Array
Description: This array is fully dynamic. It can grow and shrink during execution. It is allocated on the heap and resized as needed.

Languages: Java uses ArrayList, while Python uses list, which allows dynamic resizing.

Code Examples
Java Examples
java
Copy
Edit
public class ArrayCategories {

    // Fixed-size, Stack-Dynamic Array
    public static void fixedStackDynamicArray() {
        int size = 5;
        int[] arr = new int[size]; // allocated on heap

        for (int i = 0; i < size; i++) {
            arr[i] = i * 10;
        }

        System.out.print("[1] Fixed-size, Stack-Dynamic: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Stack-Dynamic Array
    public static void stackDynamicArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        System.out.print("[2] Stack-Dynamic: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Fixed-size, Heap-Dynamic Array
    public static void fixedHeapDynamicArray() {
        int size = 5;
        Integer[] arr = new Integer[size]; // object array on heap

        for (int i = 0; i < size; i++) {
            arr[i] = i * 2;
        }

        System.out.print("[3] Fixed-size, Heap-Dynamic: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Heap-Dynamic Array (Resizable)
    public static void heapDynamicArray() {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(i * 3); // grows dynamically
        }

        System.out.print("[4] Heap-Dynamic (Resizable): ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main driver
    public static void main(String[] args) {
        fixedStackDynamicArray();
        stackDynamicArray(6);
        fixedHeapDynamicArray();
        heapDynamicArray();
    }
}
Python Examples
python
Copy
Edit
# Fixed-size, Stack-Dynamic Array (simulated)
def fixed_stack_dynamic_array():
    size = 5
    arr = [0] * size  # array allocation (simulated stack)

    for i in range(size):
        arr[i] = i * 10

    print("[1] Fixed-size, Stack-Dynamic:", arr)

# Stack-Dynamic Array (simulated)
def stack_dynamic_array(size):
    arr = [0] * size  # dynamically sized array

    for i in range(size):
        arr[i] = i + 1

    print("[2] Stack-Dynamic:", arr)

# Fixed-size, Heap-Dynamic Array (simulated)
import array
def fixed_heap_dynamic_array():
    size = 5
    arr = array.array('i', [0] * size)  # fixed-size on heap

    for i in range(size):
        arr[i] = i * 2

    print("[3] Fixed-size, Heap-Dynamic:", arr)

# Heap-Dynamic Array (Resizable)
def heap_dynamic_array():
    arr = []

    for i in range(10):
        arr.append(i * 3)

    print("[4] Heap-Dynamic (Resizable):", arr)

# Main driver
if __name__ == "__main__":
    fixed_stack_dynamic_array()
    stack_dynamic_array(6)
    fixed_heap_dynamic_array()
    heap_dynamic_array()
Java vs Python Comparison
Category	Description	Java Example	Python Example
1. Fixed-size, Stack-Dynamic	Size known at runtime, declared in method	int[] arr = new int[size];	arr = [0]*size (in function)
2. Stack-Dynamic	Size passed as function argument	method(int size) { new int[size]; }	def f(size): arr = [0]*size
3. Fixed-size, Heap-Dynamic	Fixed size on heap	Integer[] arr = new Integer[size];	import array; arr = array.array('i', [0]*size)
4. Heap-Dynamic (Resizable)	Resizable array	ArrayList<Integer> arr = new ArrayList<>();	arr = [] and use append()
