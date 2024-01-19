import java.util.Scanner;

class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int mid = l + (h - l) / 2;
        while (l <= h) {
            if (arr[mid] == key) {
                System.out.print(mid);
                return;
            } else if (arr[mid] > key) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

            mid = l + (h - l) / 2;
        }
        System.out.print(-1);
        sc.close();
    }
}