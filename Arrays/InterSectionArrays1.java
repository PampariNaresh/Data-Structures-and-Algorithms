import java.util.*;

public class InterSectionArrays1 {
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
        int vis[] = new int[m];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j] && vis[j] == 0) {
                    ans.add(B[j]);
                    vis[j] = 1;

                } else if (B[j] > A[i])
                    break;
            }
        }
        for (int ele : ans)
            System.out.print(ele + " ");
        sc.close();
    }
}