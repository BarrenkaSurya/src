package Stack;
import java.util.*;
public class prefixToInfix {
        public static void main(String[] args) {
            String str = "+-*AB/CDG";

            Stack<String> s = new Stack<>();
            for(int i=str.length()-1; i>=0; i--){
                char temp = str.charAt(i);
                if((temp =='+') || (temp =='-') || (temp =='*') || (temp =='/')){
                    String t1 = s.pop();
                    String t2 = s.pop();

                    String infixtemp = "(" + t1 + temp + t2 +")";
                    s.push(infixtemp);
                }
                else{
                    s.push(Character.toString(temp));
                }
            }
            System.out.println(s.peek());
        }


}
