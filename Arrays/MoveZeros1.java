import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeros1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp.add(arr[i]);
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i < n; i++) {
            arr[i] = 0;
        }
        for(int ele:arr) System.out.print(ele+" ");
        sc.close();

    }
}
