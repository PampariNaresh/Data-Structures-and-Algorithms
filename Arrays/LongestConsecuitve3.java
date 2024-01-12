import java.util.*;

public class LongestConsecuitve3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int longest = 1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int x = arr[i];
                int count = 1;
                while (hs.contains(x + 1)) {
                    count++;
                    x += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
        sc.close();
    }
}
