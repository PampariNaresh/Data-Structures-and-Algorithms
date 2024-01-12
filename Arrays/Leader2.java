import java.util.ArrayList;
import java.util.Scanner;

public class Leader2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);

        }
        for (int i = ans.size() - 1; i >= 0; i--)
            System.out.print(ans.get(i) + " ");
        sc.close();
    }

}
