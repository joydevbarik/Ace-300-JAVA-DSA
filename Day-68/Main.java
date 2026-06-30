public class Main {


    static class ListNode {

        int data;
        ListNode next;


        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }



    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        ListNode a = headA;
        ListNode b = headB;


        while(a != b) {


            if(a == null)
                a = headB;
            else
                a = a.next;


            if(b == null)
                b = headA;
            else
                b = b.next;
        }


        return a;
    }




    public static void main(String[] args) {


        // Common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);



        // First Linked List
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;



        // Second Linked List
        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;



        ListNode result = getIntersectionNode(headA, headB);



        if(result != null)
            System.out.println("Intersection = " + result.data);
        else
            System.out.println("No Intersection");
    }
}