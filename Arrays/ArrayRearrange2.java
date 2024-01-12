import java.util.*;

public class ArrayRearrange2 {
    ArrayList<Integer> pos = new ArrayList<>();

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
        if (pos.size() < neg.size()) {
            for (int i = 0; i < pos.size(); i++) {
                arr[i * 2] = pos.get(i);
                arr[i * 2 + 1] = neg.get(i);
            }
            int index = 2 * pos.size();
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < neg.size(); i++) {
                arr[i * 2] = pos.get(i);
                arr[i * 2 + 1] = neg.get(i);
            }
            int index = 2 * neg.size();
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        }

        for (int ele : arr)
            System.out.print(ele + " ");
        sc.close();
    }

}
