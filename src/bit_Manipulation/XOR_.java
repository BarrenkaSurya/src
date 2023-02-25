package bit_Manipulation;
import java.util.*;
public class XOR_ {
    public static void main(String[] args){
        int arr[] = {7,5,4,5,4,7,2,3,2,3,6};    // finding the element which doesn't exit in pair..;
        int n = arr.length;

        int val =0;
        for(int i=0; i<arr.length; i++){
            val = val^arr[i];
        }
        System.out.println(val);
    }
}
