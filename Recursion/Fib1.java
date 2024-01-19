import java.util.Scanner;

public class Fib1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev2 = 0;
        int prev = 1;
        int i = 3;
        System.out.print(prev2 + " " + prev + " ");
        while (i <= n) {
            int curr = prev + prev2;
            System.out.print(curr + " ");
            prev2 = prev;
            prev = curr;
            i++;

        }
        sc.close();
    }
}
