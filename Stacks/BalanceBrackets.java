
import java.util.*;
import java.util.Stack;

public class BalanceBrackets {
    public static void main(String args[]) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '}' || ch == ']') {
                s.push(ch);
            } else {
                if (!s.isEmpty()) {
                    char top = s.peek();
                    if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                        s.pop();
                    } else {
                        System.out.print(false);
                        return;
                    }

                } else {
                    System.out.print(false);
                    return;
                }
            }

        }
        if (s.isEmpty())
            System.out.print(true);
        else
            System.out.print(false);
        sc.close();
    }
}
