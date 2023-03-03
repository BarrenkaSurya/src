package LinkedList_;
class Node{
    int data;
    Node next;

    public Node(int d){
        this.data = d;
        this.next = null;
    }
}

public class Linked_List {
    Node head;

    public void addLast(int d){
        Node n = new Node(d);

        if(head==null){
            head = n;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next=n;
        }
    }

    public void addFirst(int d){
        Node n = new Node(d);

        if(head==null){
            head = n;
        }
        else{
            n.next = head;
            head = n;
        }
    }
    public void add(int d, int pos){
        Node n = new Node(d);
        if(head==null){
            head = n;
        }
        else {
            Node temp = head;
            for (int i = 1; i <= pos - 2; i++) {
                temp = temp.next;
            }
            Node curr = temp.next;
            temp.next = n;
            n.next = curr;
        }
    }
    public void removeLast(){
        Node temp= head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void removeFirst(){
        Node temp = head;
        temp=temp.next;
        head.next = null;
        head = temp;
    }

    public void remove(int pos){
        Node temp = head;
        for(int i=1; i<=pos-2; i++){
            temp = temp.next;
        }
        Node n = temp.next;
        Node newNext = n.next;
        temp.next = newNext;
        n.next = null;
    }

    public void printLinkedList(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println(temp.data+"->");
    }
}
