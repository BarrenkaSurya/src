package bit_Manipulation;
import java.util.*;
public class check_Even_Odd_In_Bit_manipulation {
    public static void main(String[] args){

        int val = 32;
        int temp =1;    // 00000001 --> 1 in binary form;
        val = val & temp;

        if(val==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
