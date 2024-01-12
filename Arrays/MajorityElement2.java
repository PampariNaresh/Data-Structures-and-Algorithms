import java.util.*;

public class MajorityElement2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hs.containsKey(arr[i]))
                hs.put(arr[i], hs.get(arr[i]) + 1);
            else
                hs.put(arr[i], 1);
        }
        for(int key: hs.keySet()) {
            if(hs.get(key)>n/2) System.out.print(key);
        }
        sc.close();
    }
}
