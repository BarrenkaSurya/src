package bit_Manipulation;
import java.util.*;
public class Subtraction_without_arithmetic_operation {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int x =  sc.nextInt();
        int y = sc.nextInt();

        while(y!=0){
            int borrow = (~x)&y;
            x = x^y;
            y = borrow<<1;

        }
        System.out.println(x);
        // System.out.println(a-b);
    }
}
