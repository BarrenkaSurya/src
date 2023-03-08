package LinkedList_;


public class Double_LikedList {

    class Node{
        int data;
        Node next;
        Node prev;


        Node(int d){
            this.data = d;
            this.next = null;
            this.prev = null;       //4th march
        }
        public Node head = null;

        public void addLast(int d){
            Node n = new Node(d);

            if(head==null){
                head = n;
            }
            else{
                Node temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = n;
                n.prev = temp;
            }

        }

        public void addFirst(int d){
            Node n = new Node(d);
            if(head==null){
                head = n;
            }
            else{
                Node temp  = head;
                temp.prev  = n;
                n.next = head;
                head = n;
            }
        }
        public void add(int d, int pos){
            Node n = new Node(d);

            Node temp = head;
            for(int i=1; i<=pos-2; i++){
                temp = temp.next;
            }
            n.next = temp.next;
            n.prev = temp;
            temp.next = n;
            Node k = n.next;
            k.prev = n;
        }

        public void printDoubleLinkedList(){
            Node temp = head;
            while(temp.next!=null){
                System.out.print(temp.data+" ->");
                temp = temp.next;
            }
            System.out.println();

        }
    }
    
}
