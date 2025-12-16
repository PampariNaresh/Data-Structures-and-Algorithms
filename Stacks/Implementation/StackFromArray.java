import java.util.*;

public class StackFromArray {
    int arr[];
    int size ;
    int top;
    int capacity;
    StackFromArray(int capacity) {
      this.arr = new int[capacity];
      this.capacity = capacity;
      this.size = 0;
      this.top = -1;
    }
    public void  push(int data ) {
      
        if(top==capacity-1) {System.out.println("Stack is full");
        return;
        }else{
            top++;
            arr[top] = data;
            size++;
        }
       
        
    }

    public int pop() {
        if(top==-1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int res = arr[top];
        top--;
        size--;
        return res;

    }
    public int peek() {
        return top;
    }
    
        
    public static void main(String args[]) {
         StackFromArray s = new StackFromArray(3);
         s.push(10);
         s.push(20);
         s.push(30);
         s.push(40);
         System.out.println(s.pop());
         System.out.println(s.pop());System.out.println(s.pop());System.out.println(s.pop());

    }
}