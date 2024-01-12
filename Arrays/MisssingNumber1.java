import java.util.Scanner;

public class MisssingNumber1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int origialsum = (n * (n + 1)) / 2;
        System.out.print((origialsum - sum));

        sc.close();
    }
}
