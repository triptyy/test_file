// Code for Finding the mid of LL
class Node {
    int data; 
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedList {
    public Node findMid(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public void append(Node head, int data) {
        Node newNode = new Node(data);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(1);
        list.append(head, 2);
        list.append(head, 3);
        list.append(head, 4);
        list.append(head, 5);

        Node mid = list.findMid(head);
        System.out.println("Middle Node Data (Odd List): " + mid.data);

    
        Node headEven = new Node(1);
        list.append(headEven, 2);
        list.append(headEven, 3);
        list.append(headEven, 4);
        list.append(headEven, 5);
        list.append(headEven, 6);
        
        Node midEven = list.findMid(headEven);
        System.out.println("Middle Node Data (Even List): " + midEven.data);
    }
}
