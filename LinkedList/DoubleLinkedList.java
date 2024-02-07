public class DoubleLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public static Node insertathead(Node head, int data) {
        Node newnode = new Node(data);
        if (head == null) {
            return new Node(data);
        } else {
            Node temp = head;
            newnode.next = head;
            temp.prev = newnode;
            head = newnode;
            return head;
        }
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node head = null;
        head = insertathead(head, 10);
        head = insertathead(head, 20);
        print(head);

    }
}
