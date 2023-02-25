package binry_Search;
import java.util.*;
public class sum0f_Pair {
    public static boolean findPair(int arr[], int s, int e, int k){
        while(s<e){
            if(arr[s]+arr[e]==k){
                return true;
            }
            else if(arr[s]+ arr[e] < k){
                s++;
            }
            else{
                e--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7, 8, 9, 10, 12, 13};
        int k = 8;

        boolean result = findPair(arr, 0, 9, k);
        if (result == true) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
    }
}
