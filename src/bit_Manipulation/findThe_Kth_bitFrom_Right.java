package bit_Manipulation;
import java.util.*;
public class findThe_Kth_bitFrom_Right {
    public static void main(String[] args){

        int val = 93;     // 1 0 0 1 0 1 --> binary form..
        int  k =3;        // 0 0 0 0 0 1  // 1 starting point......
        int mask = 1<<(k-1);
        val = val & mask;

        if(val==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }

    }
}
