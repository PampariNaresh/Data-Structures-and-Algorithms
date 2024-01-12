import java.util.Scanner;

public class LongestConsecuitve {
    public static boolean linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int longest = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while (linearsearch(arr, x + 1) == true) {
                x = x + 1;
                count += 1;
                longest = Math.max(count, longest);
            }

        }
        
        System.out.println(longest);
        sc.close();
    }
}
