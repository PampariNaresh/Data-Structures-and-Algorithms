import java.util.Scanner;

public class NextPermutation {
    public static void reverse(int arr[], int l, int r) {
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        for (int i = n - 1; i >= index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        reverse(arr, index + 1, n - 1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
