package bit_Manipulation;
import java.util.*;
public class number_is_Power_Of_2_OrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if(n!=0){
            if((n & (n-1))==0){
                System.out.println("yes");
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println("no");
        }
    }
}
