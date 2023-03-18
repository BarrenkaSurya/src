package Stack;
import java.util.*;
public class reverseStack {
    public static Stack<Integer> ReverseStack(Stack<Integer> s){
        Stack<Integer> rev = new Stack<>();

        while(s.empty()!=true){
            int topVal = s.peek();
            s.pop();
            rev.push(topVal);

        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            s.push(temp);
        }
        s = ReverseStack(s);
       //System.out.print(s);

        while(s.empty()!=true){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
