package bit_Manipulation;
import java.util.*;
public class find_powerOf_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 1<<n;
        System.out.println(result);

    }
}
