import java.util.HashMap;

public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node deleteDuplicates(Node head) {

        HashMap<Integer, Integer> map = new HashMap<>();

        Node temp = head;
        while (temp != null) {
            map.put(temp.data, map.getOrDefault(temp.data, 0) + 1);
            temp = temp.next;
        }
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null) {

            if (map.get(prev.next.data) > 1)
                prev.next = prev.next.next;
            else
                prev = prev.next;
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
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        head = deleteDuplicates(head);

        print(head);
    }
}