import java.util.Scanner;

public class MissingNumber2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0) System.out.print(i);
        }

        sc.close();
    }
}
