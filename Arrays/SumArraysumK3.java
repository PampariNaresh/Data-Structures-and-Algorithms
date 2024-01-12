import java.util.*;

public class SumArraysumK3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer, Integer> hs = new HashMap<>();
        int sum = 0;
        int maxlength = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxlength = Math.max(maxlength, i + 1);
            }
            int rem = sum - k;
            if (hs.containsKey(rem)) {
                int len = i - hs.get(rem);
                maxlength = Math.max(maxlength, len);
            }
            if (!hs.containsKey(sum))
                hs.put(sum, i);

        }
        System.out.print(maxlength);
        sc.close();
    }
}
