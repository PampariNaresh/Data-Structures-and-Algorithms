import java.util.*;

public class DutchNationalFlag {
    public static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Brute Froce -Sorting -Arrays.sort(arr);
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid < high) {
            if (arr[mid] == 0) {
                swap(low, mid, arr);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(mid, high, arr);

                high--;
            }
        }
        for (int ele : arr)
            System.out.print(ele + " ");
        sc.close();
    }
}
