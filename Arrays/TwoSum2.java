
import java.util.*;

public class TwoSum2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            if (arr[l] + arr[r] == k) {
                System.out.print(l + " " + r);
                break;
            } else if (arr[l] + arr[r] < k) {
                l++;
            } else {
                r--;
            }

        }

        sc.close();
    }
}
