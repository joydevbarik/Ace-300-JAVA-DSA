public class Main {
    static class MyLinkedList {
        class Node {
            int value;
            Node next;
            Node(int value) {
                this.value = value;
            }
        }
        Node head;
        int size;
        public int get(int index) {
            if(index < 0 || index >= size)
                return -1;
            Node temp = head;
            for(int i = 0; i < index; i++)
                temp = temp.next;
            return temp.value;
        }
        public void addAtHead(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;
            size++;
        }
        public void addAtTail(int value) {
            Node node = new Node(value);
            if(head == null) {
                head = node;
            }
            else {
                Node temp = head;
                while(temp.next != null)
                    temp = temp.next;
                temp.next = node;
            }
            size++;
        }
        public void addAtIndex(int index, int value) {
            if(index < 0 || index > size)
                return;
            if(index == 0) {
                addAtHead(value);
                return;
            }
            Node temp = head;
            for(int i = 0; i < index-1; i++)
                temp = temp.next;
            Node node = new Node(value);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
        public void deleteAtIndex(int index) {


            if(index < 0 || index >= size)
                return;
            if(index == 0) {
                head = head.next;

            }
            else {
                Node temp = head;
                for(int i = 0; i < index-1; i++)
                    temp = temp.next;
                temp.next = temp.next.next;
            }
            size--;
        }
        public void printList() {
            Node temp = head;
            while(temp != null) {

                System.out.print(temp.value + " ");

                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {


        MyLinkedList list = new MyLinkedList();
        list.addAtHead(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtIndex(1,15);

        System.out.println("Linked List:");
        list.printList();
        System.out.println("\nValue at index 2: "
                + list.get(2));

        list.deleteAtIndex(1);
        System.out.println("After deletion:");
        list.printList();

    }
}