import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence6_1 {
    public static void subsequence(int i, int arr[], ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans) {
        if (i == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[i]);
        subsequence(i + 1, arr, ds, ans);
        ds.remove(ds.size() - 1);
        subsequence(i + 1, arr, ds, ans);
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
        subsequence(0, arr, ds, ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        sc.close();
    }
}
