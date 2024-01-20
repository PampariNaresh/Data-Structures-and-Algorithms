import java.util.Scanner;

public class FirstLastOccurrenc {

    public static int firstoccur(int arr[], int n, int key) {
        int l = 0;
        int h = n - 1;
        int mid = l + (h - l) / 2;
        int ans = -1;
        while (l <= h) {
            if (arr[mid] == key) {
                ans = mid;
                h = mid - 1;

            } else if (arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

            mid = l + (h - l) / 2;
        }
        return ans;// low
    }

    public static int lastoccur(int arr[], int n, int key) {
        int l = 0;
        int h = n - 1;
        int mid = l + (h - l) / 2;
        int ans = -1;
        while (l <= h) {
            if (arr[mid] == key) {
                ans = mid;
                l = mid + 1;

            } else if(arr[mid]<key){
                l = mid+1;
            }else {
                h = mid - 1;

            }

            mid = l + (h - l) / 2;
        }
        return ans;// high
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int k = sc.nextInt();
        System.out.println(firstoccur(arr, n, k));
        System.out.println(lastoccur(arr, n, k));

        sc.close();
    }
}
