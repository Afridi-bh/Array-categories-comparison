public class StackDynamic {
    public static void main(String[] args) {
        stackDynamicArray(6);
    }

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
}

