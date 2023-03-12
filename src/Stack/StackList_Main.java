package Stack;

public class StackList_Main {
    public static void main(String[] args) {
        Stack_list  s1 = new Stack_list();
        s1.push(5);
        s1.push(3);
        s1.push(2);
        s1.push(4);
        s1.push(8);
        s1.printStack();
        s1.pop();
        s1.printStack();
        System.out.println(s1.peek());
        boolean result = s1.isEmpty();
        System.out.println(result);

    }

}
