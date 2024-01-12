import java.util.*;

public class MajorityElement3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int ele = arr[0];
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
                System.out.println(" " + ele);
            } else if (arr[i] == ele) {
                count++;
                System.out.println("count " + count);
            } else {
                count--;
                System.out.println("count " + count);
            }
        }
        System.out.print(ele);
        sc.close();
    }
}
