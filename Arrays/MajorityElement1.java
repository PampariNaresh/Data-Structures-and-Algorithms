import java.util.*;

public class MajorityElement1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.print(arr[i] + " ");
                break;
            }
        }
        sc.close();
    }
}
