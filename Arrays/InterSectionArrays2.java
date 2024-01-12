
import java.util.*;

public class InterSectionArrays2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int B[] = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (A[i] < B[j])
                i++;
            else if (A[i] > B[j])
                j++;
            else {
                ans.add(A[i]);
                i++;
                j++;
            }
        }
        for (int ele : ans)
            System.out.print(ele + " ");
        sc.close();
    }
}
