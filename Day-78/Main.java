import java.util.ArrayList;

public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isPalindrome(Node head) {

        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.data);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            if (!list.get(left).equals(list.get(right)))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}