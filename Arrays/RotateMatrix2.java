import java.util.Scanner;

public class RotateMatrix2 {

    public static void reverse(int mat[][], int i) {
        int l = 0;
        int r = mat.length - 1;
        while (l <= r) {
            int temp = mat[i][l];
            mat[i][l] = mat[i][r];
            mat[i][r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                mat[i][j] = mat[j][i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            reverse(mat, i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
