package sorting_Algorithm;
import java.util.*;
public class insertion_Sort {
    public static void insertionSort(int arr[], int n){

        int i,j,k;                 ///0,1,2,3,4,5,6,7,8
        for(i=1; i<n; i++) {      //{7,13,5,21,11,8,6,3};
            k = arr[i];           // j i
            j = i - 1;

            while (j >= 0 && arr[j] > k) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1]=k;
        }



    }
    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {7,13,5,21,11,8,6,3};
        int n = arr.length;

        printArray( arr, n);
        insertionSort(arr,n);
        printArray( arr, n);
    }

}
