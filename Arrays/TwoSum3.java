
import java.util.*;

public class TwoSum3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int more = k - num;
            if (hs.containsKey(more)) {
                System.out.print(hs.get(more)+ " " + i);
                break;
            } else {
                hs.put(num, i);
            }

        }
        sc.close();
    }
}
