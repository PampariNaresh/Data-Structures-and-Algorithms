
import java.util.Scanner;

class LowerBound {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int mid = l + (h - l) / 2;
        int ans = n;
        while (l <= h) {
            if (arr[mid] >= key) {
                ans = mid;
                h = mid - 1;

            } else {
                l = mid + 1;
            }

            mid = l + (h - l) / 2;
        }
        System.out.print(ans);
        sc.close();
    }
}