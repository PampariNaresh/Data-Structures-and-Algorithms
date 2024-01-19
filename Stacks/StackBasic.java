import java.util.*;

class StackBasic {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(20);
        s.push(30);
        for(int ele:s) System.out.print(ele +" ");
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());

    }
}