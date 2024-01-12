import java.util.Scanner;

public class SetMatrix3 {
    public static void markrow(int mat[][], int row) {
        for (int i = 0; i < mat[0].length; i++) {
            mat[row][i] = -1;
        }
    }

    public static void markcol(int mat[][], int col) {
        for (int i = 0; i < mat.length; i++) {
            mat[i][col] = -1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    if (j != 0)
                        mat[0][j] = 0;
                    else {
                        col0 = 0;
                    }

                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] != 0) {
                    if (mat[0][j] == 0 || mat[i][0] == 0) {
                        mat[i][j] = 0;
                    }
                }
            }
        }
        if (mat[0][0] == 0) {
            for (int j = 0; j < m; j++)
                mat[0][j] = 0;
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
