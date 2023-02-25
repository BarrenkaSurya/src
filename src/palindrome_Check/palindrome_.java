package palindrome_Check;
import java.util.*;
public class palindrome_ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int ans =0;
        while(n>0){
            int lastDigit = n % 10;
            ans = ans * 10 +lastDigit;
            n = n/10;
        }
        if(temp == ans){
            System.out.println("palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}
