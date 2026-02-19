class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SinglyLinkedList {

    static Node head = null;
    static Node end = null;

    public static void insertAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            end.next = node;
        }
        end = node;
    }

    public static void insertAtBeginning(int data) {
        Node node = new Node(data);
        if (head == null) {
            end = node;
        }
        node.next = head;
        head = node;
    }

    public static void printLinkedList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertAtBeginning(70);
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        printLinkedList();
    }
}
