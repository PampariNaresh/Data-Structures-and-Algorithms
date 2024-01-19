import java.util.*;
import java.util.Stack;

public class DuplicateBracket {
    public static void main(String args[]) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
      
            if (ch == ')') {
                if (s.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while (s.peek() != '(') {
                        s.pop();

                    }
                    s.pop();
                }

            } else {
                s.push(ch);
            }
        }
        System.out.println(false);
        sc.close();
    }
}
