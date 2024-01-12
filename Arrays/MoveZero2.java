
import java.util.*;

public class MoveZero2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for (int k = 0; k < n; k++) {
            if (arr[k] == 0) {
                j = k;
                break;
            }
        }
        int i = j + 1;
        for (; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
        for(int ele:arr) System.out.print(ele+" ");
        sc.close();

    }
}
