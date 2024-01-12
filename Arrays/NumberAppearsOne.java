import java.util.Scanner;

public class NumberAppearsOne {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        /*
         * Opttimal Xor
         * int xor = 0;
         * for (int i = 0; i < n; i++) {
         * xor ^= arr[i];
         * }
         * System.out.print(xor);
         */

        /*
         * Hashing
         * int maxi = arr[0];
         * for (int i = 0; i < n; i++) {
         * if (arr[i] > maxi)
         * maxi = arr[i];
         * }
         * int hash[] = new int[maxi+1];
         * for (int i = 0; i < n; i++) {
         * hash[arr[i]] += 1;
         * }
         * for (int i = 1; i < hash.length; i++) {
         * if (hash[i] == 1) {
         * System.out.print(i);break;}
         * 
         * }
         */

         for(int i=0;i<n;i++) {
            int num =arr[i];
            int count =0;
            for(int j=0;j<n;j++) {
                if(arr[j]==num) count++;
            }
            if(count==1) {
                System.out.print(num);
                break;
            }
         }

        sc.close();
    }
}
