
import java.util.Scanner;

public class FunctionalRecusion {

    public static int NaturalSum(int n) {
        if (n == 0)
            return 0;
        return n + NaturalSum(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(NaturalSum(n));
        sc.close();
    }

}
