package Stack;
import java.util.*;
public class parenthesis_Stack_Of_Type_2{
    public static boolean checkParenthesisIs(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char temp = str.charAt(i);
            if(temp=='{' || temp == '[' || temp =='('){
                s.push(temp);
            }
            if(s.isEmpty()){
                return false;
            }
            int topBracket;
            switch(temp){
                case ')' :
                    topBracket = s.peek();
                    if(topBracket == '{' ||topBracket== '['){
                        return false;
                    }
                    s.pop();
                    break;

                case ']' :
                    topBracket = s.peek();
                    if(topBracket == '{' || topBracket=='('){
                        return false;
                    }
                    s.pop();
                    break;

                case '}' :
                     topBracket = s.peek();
                     if(topBracket=='[' || topBracket =='('){
                         return false;
                     }
                     s.pop();
                     break;
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String str = "{[()]}";

        if(checkParenthesisIs(str)==true){
            System.out.println("balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}
