public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node swap(Node head) {

        if (head == null || head.next == null)
            return head;

        Node first = head;
        Node second = head.next;

        first.next = swap(second.next);
        second.next = first;

        return second;
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

        head = swap(head);

        print(head);
    }
}