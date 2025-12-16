class StackFromLinkedList {
    private Node head = null;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data =data;
            this.next = null;
        }
    }
    public Node push(int num) {
        Node node = new Node(num);
        if(head==null) {
            head = node;
            return head;
        }else {
            node.next = head;
            head = node;
            return head;
        }
   
    }
    public int pop() {
        if(head==null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int res = head.data;
        head = head.next;
        return res;
    
    }

    public int peek() {
        return head.data;
    }
    public static void main(String args[]) {
     Node head = null;
     StackFromLinkedList s = new StackFromLinkedList();
     s.push(10);
     s.push(20);
     s.push(40);
     s.push(50);
     System.out.println(s.pop());
     System.out.println(s.peek());
    }
}
