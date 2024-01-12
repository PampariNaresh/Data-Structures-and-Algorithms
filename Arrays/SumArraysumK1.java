import java.util.Scanner;

public class SumArraysumK1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sumk = sc.nextInt();
        int maxilength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == sumk)
                    maxilength = Math.max(maxilength, j - i + 1);
            }
        }
        System.out.print(maxilength);

        sc.close();
    }
}
