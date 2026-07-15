public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverse(Node head) {

        Node prev = null;

        while (head != null) {

            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        print(head);

        head = reverse(head);

        System.out.print("\nReversed List: ");
        print(head);
    }
}