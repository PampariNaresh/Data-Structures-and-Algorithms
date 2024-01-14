import java.util.Scanner;

public class BacktrackNatural2 {
    public static void printNumberBack(int i, int n) {
        if (i > n)
            return;
        printNumberBack(i + 1, n);
        System.out.println(i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberBack(1, n);
        sc.close();

    }

}
