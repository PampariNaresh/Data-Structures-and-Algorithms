
import java.util.*;

public class LeftRotateDPlaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        int index = 0;
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[index];
            index++;
        }
        for (int ele : arr)
            System.out.print(ele + " ");
        sc.close();

    }
}