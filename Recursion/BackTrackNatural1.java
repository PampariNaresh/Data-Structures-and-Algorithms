import java.util.Scanner;

public class BackTrackNatural1 {
    public static void printNumberBack(int i, int n) {
        if (i < 1)
            return;
        printNumberBack(i - 1, n);
        System.out.println(i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberBack(n, n);
        sc.close();

    }
    


}
