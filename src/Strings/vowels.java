package Strings;
import java.util.*;
public class vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        for(int i=0; i<num.length(); i++){
            char c = num.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o'  || c== 'u'){

            }
            else{
                System.out.print(num.charAt(i));
            }

        }

    }

}
