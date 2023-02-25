package bit_Manipulation;
import java.util.*;
public class add_one_to_a_number {
    public static int addOne(int n){
        int mask = 1;
        while((n & mask) > 0){
            n = n ^ mask;
            mask = mask<<1;
        }
        n = n ^ mask;
        return n;
    }
    public static void main(String[] args){
        int n = 40;

        int result = addOne(n);
        System.out.println(result);
    }
}
