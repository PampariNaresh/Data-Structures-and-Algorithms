
import java.util.ArrayList;

public class Demo {
    public static void arrangePeople(int[] A) {
        int n = A.length;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (A[i] == -1) {
                result.add(0, String.valueOf(i + 1)); // person i is at the front
            } else {
                int index = result.indexOf(String.valueOf(A[i] + 1));
                result.add(index, String.valueOf(i + 1)); // person i is behind person A[i]
            }
        }

        System.out.println(String.join(" ", result));
    }

    public static void main(String[] args) {
        // Example usage:
        int[] A = { 2, -1, 3, 1 };
        arrangePeople(A);
    }
}
