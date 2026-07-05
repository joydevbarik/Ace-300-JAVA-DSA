import java.util.HashMap;

public class Main {

    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
            next = null;
            random = null;
        }
    }

    public static Node copyList(Node head) {

        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        while (temp != null) {
            map.put(temp, new Node(temp.data));
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {

            if (temp.next != null)
                map.get(temp).next = map.get(temp.next);

            if (temp.random != null)
                map.get(temp).random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }

    public static void print(Node head) {

        while (head != null) {

            System.out.print(head.data);

            if (head.random != null)
                System.out.print(" -> Random: " + head.random.data);

            System.out.println();

            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next = c;

        a.random = c;
        b.random = a;
        c.random = b;

        Node copy = copyList(a);

        print(copy);
    }
}