package bit_Manipulation;
import java.util.*;
public class subtract_one_number {
    public static int subtractOne(int n){
        int mask = 1;
        while((n & mask) == 0){
            n = n ^ mask;
            mask = mask<<1;
        }
        n = n ^ mask;
        return n;
    }
    public static void main(String[] args){
        int n = 42;
        int result = subtractOne(n);
        System.out.println(result);
    }
}
