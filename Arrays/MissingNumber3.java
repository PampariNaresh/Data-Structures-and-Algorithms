import java.util.*;

public class MissingNumber3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int hash[] = new int[n+1];
        for(int i=0;i<arr.length;i++) {
            hash[arr[i]] =1;
         }
         for(int i=1;i<hash.length;i++) 
          {
            if(hash[i]==0) {
                System.out.print(i);
            }
          }
        sc.close();
    }
}
