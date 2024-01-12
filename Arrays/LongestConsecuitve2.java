import java.util.*;

public class LongestConsecuitve2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int longest = 0;
        int curCount = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmaller) {
                curCount += 1;
                lastSmaller = arr[i];

            } else if (arr[i] != lastSmaller) {
                curCount = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, curCount);
        }
        System.out.println(longest);
        sc.close();
    }
}
