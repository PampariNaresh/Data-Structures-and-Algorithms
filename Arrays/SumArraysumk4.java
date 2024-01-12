import java.util.*;

public class SumArraysumk4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int sum = arr[0];
        int maxlength = 0;
        int left = 0;
        int right = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxlength = Math.max(maxlength, right - left + 1);
            }
            right++;
            if (right < n)
                sum += arr[right];
        }
        System.out.print(maxlength);
        sc.close();
    }
}
