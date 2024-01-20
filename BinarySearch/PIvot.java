import java.util.Scanner;

public class PIvot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int l = 0;
        int h = n - 1;
        int mid = l + (h - l) / 2;

        while (l < h) {
            if (arr[mid] >= arr[0]) {

                l = mid + 1;
            } else {
                h = mid;
            }

            mid = l + (h - l) / 2;
        }
        System.out.print(l);
        sc.close();
    }
}
