
import java.util.*;

public class CheckSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                flag = 1;
                break;
            }
        }
        if(flag ==1)
        System.out.println("Not Sorted");
 
        else {
            System.out.println("Sorted");
        }
        sc.close();

    }
}