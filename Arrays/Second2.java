
import java.util.*;

public class Second2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        int slarge = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i]>slarge && arr[i] != largest) {
                slarge = arr[i];
            }
        }
        System.out.println(slarge);

        sc.close();

    }
}
