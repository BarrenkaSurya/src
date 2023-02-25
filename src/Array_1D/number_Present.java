package Array_1D;
import java.util.*;
public class number_Present {
    public static boolean findElement(int arr[], int n, int k){
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
    public static int findElementint(int arr[], int n, int k){
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = {1, 4,3,2,6,7,5};
        int k = 8;
        boolean  result = findElement(arr,n,k);
        if(result==true){
            System.out.print("element is present");
        }
        else{
            System.out.print("element is not present");
        }



    }
}
