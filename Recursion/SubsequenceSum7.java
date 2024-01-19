
import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceSum7 {
    public static void subsequence(int i, int arr[], ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans,
            int sum) {
        if (i == arr.length) {
            if (sum == 2) {
                ans.add(new ArrayList<>(ds));
                
            }
            return;
        }
        ds.add(arr[i]);
        subsequence(i + 1, arr, ds, ans, sum + arr[i]);
        ds.remove(ds.size() - 1);
        subsequence(i + 1, arr, ds, ans, sum - arr[i]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        subsequence(0, arr, ds, ans, sum);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        sc.close();
    }
}
