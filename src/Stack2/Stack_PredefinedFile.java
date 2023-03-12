package Stack2;

import java.util.Stack;

public class Stack_PredefinedFile {
    public static void main(String[] args) {
        Stack<Integer> s2 = new Stack<>();

        s2.push(6);
        s2.push(8);
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(1);
        System.out.println(s2);
        s2.pop();
        //System.out.println(s2);
        System.out.println(s2.peek());
        boolean result = s2.empty();
        System.out.println(result);

    }

}
