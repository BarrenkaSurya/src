package bit_Manipulation;
import java.util.*;
public class change_the_rightMost_SetBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = 1;
        while((n & mask) == 0){
            mask = mask << 1;
        }
        int result = n & (~mask);
        System.out.println(result);
    }
}
