import java.util.Scanner;

public class FirstAndLastOccurenceIndex {
    public static int lowerbound(int arr[], int n, int key) {
        int l = 0;
        int h = n - 1;
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
        return ans;
    }

    public static int upperbound(int arr[], int n, int key) {
        int l = 0;
        int h = n - 1;
        int mid = l + (h - l) / 2;
        int ans = n;
        while (l <= h) {
            if (arr[mid] > key) {
                ans = mid;
                h = mid - 1;

            } else {
                l = mid + 1;
            }

            mid = l + (h - l) / 2;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int k = sc.nextInt();
        int ansarray[] = new int[2];
        if(lowerbound(arr, n, k)==n || arr[lowerbound(arr, n, k)]!=k) {
            System.out.print("-1 -1");
            sc.close();
            return;
        }
        ansarray[0] = lowerbound(arr, n, k);
        ansarray[1] = upperbound(arr, n, k) - 1;
        for (int ele : ansarray)
            System.out.print(ele + "  ");

        sc.close();
    }
}
