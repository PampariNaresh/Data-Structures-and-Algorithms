
class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node insertathead(int data, Node head) {
        if (head == null) {
            head = new Node(data);
            return head;
        } else {
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
            return head;
        }

    }

    public static Node insertatend(int data, Node head) {
        if (head == null) {
            head = new Node(data);
            return head;
        } else {
            Node newnode = new Node(data);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            return head;
        }

    }

    public static void print(Node head) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
    }

    public static int count(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public static Node insertatpos(Node head, int data, int k) {
        if (k == 1) {
            head = insertatend(data, head);
            return head;
        }
        if (count(head) == k) {
            head = insertatend(data, head);
            return head;
        }
        Node prev = null;
        Node curr = head;
        int i = 1;
        while (curr.next != null && i <= k - 1) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        Node newnode = new Node(data);
        newnode.next = prev.next;
        prev.next = newnode;
        return head;

    }

    public static Node insertNode(Node head, Node other, int data) {
        Node temp = head;
        while (temp != null && temp.data != other.data) {
            temp = temp.next;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }

    public static Node deletehead(Node head) {
        return head.next;
    }

    public static Node deleteend(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteatk(Node head, int k) {
        Node prev = null;
        Node curr = head;
        int i = 1;
        while (curr != null && i <= k - 1) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = curr.next;
        return head;
    }

    public static Node deletebefore(Node head, Node other) {
        Node temp = head;
        Node prev = null;
        while (temp.data != other.data && temp != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;

    }

    public static void main(String args[]) {
        Node head = null;
        head = insertathead(10, head);
        head = insertatend(20, head);
        head = insertatend(30, head);

        head = insertatpos(head, 40, 2);
        head = insertNode(head, new Node(40), 50);
        print(head);
        head = deletehead(head);
        print(head);
        head = deleteend(head);
        print(head);
        head = deleteatk(head, 2);
        print(head);
        head = deletebefore(head, new Node(20));
        print(head);





        

    }
}
