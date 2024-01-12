import java.util.Scanner;

public class BuyAndSell {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int profit = 0;
        int mini = arr[0];
        for (int i = 1; i < n; i++) {
            profit = Math.max(profit, arr[i] - mini);
            mini = Math.min(mini, arr[i]);

        }
        System.out.print(profit);
        sc.close();
    }
}
