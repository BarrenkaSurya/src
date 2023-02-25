package sorting_Algorithm;
import java.util.*;
public class selection_Sort {
    public static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }
    }
    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        int n = arr.length;

        printArray(arr,n);
        selectionSort(arr,n);
        printArray(arr,n);


    }


}
