
import java.util.*;

public class UnionArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;

            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;

            }
        }
        while (i < n) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);

            i++;

        }
        while (j < m) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);

            j++;

        }
        for (int ele : union)
            System.out.print(ele + " ");

        sc.close();

    }
}
