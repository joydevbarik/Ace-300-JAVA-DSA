import java.util.Stack;

public class Main {

    static class Node {
        int data;
        Node prev, next, child;

        Node(int data) {
            this.data = data;
        }
    }

    static Node flatten(Node head) {

        if (head == null)
            return null;

        Stack<Node> stack = new Stack<>();
        stack.push(head);

        Node dummy = new Node(0);
        Node prev = dummy;

        while (!stack.isEmpty()) {

            Node curr = stack.pop();

            prev.next = curr;
            curr.prev = prev;

            if (curr.next != null)
                stack.push(curr.next);

            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }

            prev = curr;
        }
        head.prev = null;
        return head;
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
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.child = new Node(7);
        head.next.child.next = new Node(8);
        head.next.child.next.prev = head.next.child;

        head = flatten(head);

        print(head);
    }
}