public class FixedStackDynamic {
    public static void main(String[] args) {
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
}
