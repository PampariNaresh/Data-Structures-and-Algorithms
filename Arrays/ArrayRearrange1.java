import java.util.*;

public class ArrayRearrange1 {ArrayList<Integer> pos = new ArrayList<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < n / 2; i++) {
            arr[i * 2] = pos.get(i);
            arr[i * 2 + 1] = neg.get(i);
        }
        for (int ele : arr)
            System.out.print(ele + " ");
        sc.close();
    }

}
