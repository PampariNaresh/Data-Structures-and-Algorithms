
import java.util.*;

public class RemoveDuplicate1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        HashSet<Integer> s = new HashSet<>();
        for (int i : arr) {
            s.add(i);

        }
        int index = 0;
        for (int ele : s) {
            arr[index] = ele;
            index++;
        }
        for (int ele : arr)
            System.out.print(ele + " ");

        sc.close();

    }
}