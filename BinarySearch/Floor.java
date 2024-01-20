
import java.util.*;

public class Floor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int k = sc.nextInt();
        int l = 0;
        int h = n - 1;
        int mid = l + (h - l) / 2;
        int ans = -1;
        while (l <= h) {
            if (arr[mid] <= k) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
            mid = l + (h - l) / 2;

        }
        System.out.print(arr[ans]);
        sc.close();
    }
}
