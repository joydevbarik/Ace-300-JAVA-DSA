import java.util.ArrayList;

public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node partition(Node head, int x) {

        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
 
        while (head != null) {

            if (head.data < x)
                small.add(head.data);
            else
                large.add(head.data);

            head = head.next;
        } 
        Node dummy = new Node(0);
        Node temp = dummy;

        for (int num : small) {
            temp.next = new Node(num);
            temp = temp.next;
        }

        for (int num : large) {
            temp.next = new Node(num);
            temp = temp.next;
        }

        return dummy.next;
    }

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        head = partition(head, 3);

        print(head);
    }
}