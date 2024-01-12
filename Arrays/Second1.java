
import java.util.*;

public class Second1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int largest = arr[n - 1];
        int slarge = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != largest) {
                slarge = arr[i];
                break;
            }
        }
        System.out.println(slarge);

        sc.close();

    }
}