package Stack;

class Node{
    int data;
    Node next;

    public Node(int d){
        this.data = d;
        this.next = null;
    }
}
public class Stack_list {
    Node top = null;
    //push--> adding values in top of the stack... initially top is null in statck.....
    public void push(int d){
        Node n = new Node(d);

        n.next = top;
        top = n;
    }
     //pop--> removing value in stack........
    public void pop(){
        if(top==null){
            System.out.println("stack is empty");
        }
        else{
            top = top.next;
        }
    }

    //peek--> it prints the top value in stack............
    public int peek(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }

    public void printStack(){
        Node temp = top;
        while(temp.next!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(temp.data+"-->");
    }
}
