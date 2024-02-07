import java.util.Scanner;

public class SearchRotatedSorted {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int l = 0;
        int h = n - 1;
        int mid = l + (h - l) / 2;
        while (l <= h) {
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            // leftsorted
            if (arr[l] <= arr[mid]) {
                if (arr[l] <= target && arr[mid] >= target) {
                    h = mid - 1;

                } else {
                    l = mid + 1;
                }

            } else {
                if (arr[h] >= target && arr[mid] <= target) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }

            }
            mid = l + (h - l) / 2;

        }

        sc.close();
    }

}
