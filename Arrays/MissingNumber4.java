import java.util.Scanner;

public class MissingNumber4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int xor1 =0;
        for(int i=1;i<=n;i++) {
            xor1^=i;
        }
        for(int i=0;i<arr.length;i++) {
            xor1 = xor1^arr[i];
        }
        System.out.println(xor1);

        sc.close();
    }
}
