import java.util.Scanner;

public class MaximumConOne {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count += 1;
                maxi = Math.max(count, maxi);

            } else {
                count = 0;
            }
        }
        System.out.println(maxi);
        sc.close();
    }
}
