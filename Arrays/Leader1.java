import java.util.ArrayList;
import java.util.Scanner;

public class Leader1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int flag = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                ans.add(arr[i]);
        }
        for(int ele:ans) System.out.print(ele +" ");
        sc.close();
    }

}
