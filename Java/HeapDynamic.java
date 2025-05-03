import java.util.ArrayList;

public class HeapDynamic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(i * 3); // can grow dynamically
        }

        System.out.print("[4] Heap-Dynamic (Resizable): ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}


