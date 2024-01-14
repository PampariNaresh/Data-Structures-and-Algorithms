import java.util.Scanner;

class NaturalNumber1 {
    public static void printNumber(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        printNumber(i + 1, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(1, n);
        sc.close();
    }
}