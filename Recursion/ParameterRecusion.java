import java.util.Scanner;

public class ParameterRecusion {

    public static void NaturalSum(int i, int sum) {
        if (i < 1) {
            System.out.print(sum);
            return;
        }
        NaturalSum(i - 1, sum + i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NaturalSum(n, 0);
        sc.close();
    }

}
