import java.util.Scanner;

public class Spiral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;
        while ( top <= bottom && left<=right) {
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }

}
