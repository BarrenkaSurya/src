package LinkedList_;

public class LinkedList_Main {
    public static void main(String[] args){
        Linked_List  l = new Linked_List();

        l.addLast(5);
        l.addLast(9);
        l.addLast(6);
        l.addLast(5);
        l.addLast(3);
        l.addLast(10);

        l.printLinkedList();
        l.addFirst(1);
        l.addFirst(0);
        l.addFirst(2);
        l.addLast(20);
        l.printLinkedList();
        l.add(23,6);
        l.printLinkedList();
        l.removeLast();
        l.printLinkedList();
        l.removeFirst();
        l.printLinkedList();
        l.remove(5);
        l.printLinkedList();



    }
}
