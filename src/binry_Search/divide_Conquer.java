package binry_Search;
import java.util.*;
public class divide_Conquer {
    public static boolean binarySearch(int arr[], int s, int e, int k){
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==k){
                return true;
            }
            else if(arr[mid]<k){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
       int arr[] = {1,3,5,6,7,8,9,10,12,13};
       int k = 8;

       boolean result = binarySearch(arr,0,9,k);
       if(result==true){
           System.out.println("present");
       }
       else{
           System.out.println("not present");
       }

    }
}
