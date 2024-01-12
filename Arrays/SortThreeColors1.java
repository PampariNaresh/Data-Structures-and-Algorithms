import java.util.*;

public class SortThreeColors1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Brute Froce -Sorting -Arrays.sort(arr);
        int c0 = 0;
        int c1 = 0;
        int c2 = 2;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            } else if (arr[i] == 2) {
                c2++;
            }
        }
        for (int i = 0; i < c0; i++) {
            arr[i] = 0;
        }
        for (int i = c0; i < c0 + c1; i++) {
            arr[i] = 1;
        }
        for (int i = c0+c1; i < n; i++) {
            arr[i] = 2;

        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
