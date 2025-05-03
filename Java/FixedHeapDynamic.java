public class FixedHeapDynamic {
    public static void main(String[] args) {
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
}


