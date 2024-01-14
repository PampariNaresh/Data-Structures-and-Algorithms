import java.util.Scanner;

public class PascalTriangle {
    public static int c(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int r = sc.nextInt();
        
        for(int i=0;i<=n;i++) {
        System.out.print(c(n,i)+" ");
        }
        sc.close();
    }
}
