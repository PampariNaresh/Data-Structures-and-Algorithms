
import java.util.*;

public class RemoveDuplicate2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        for (; j < n; j++) {
            if (arr[i] == arr[j]) {

            } else {
                i++;
                arr[i] = arr[j];

            }
        }
        for (int ele : arr)
            System.out.print(ele + " ");

        sc.close();

    }
}