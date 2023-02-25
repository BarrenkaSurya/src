package sorting_Algorithm;
import java.util.*;
public class bubble_Sort {
    public static void bubbleSort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
         int arr[] = {5,4,3,2,1};
         int n = arr.length;

        printArray(arr,n);
        bubbleSort(arr,n);
        printArray(arr,n);
    }
}
