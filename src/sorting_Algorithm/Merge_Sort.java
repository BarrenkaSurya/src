package sorting_Algorithm;
import java.util.*;
public class Merge_Sort {
    public static void merge(int arr[], int s, int mid, int e){

        int n1 = mid-s+1;
        int n2 = e - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[s+i];
        }

        for(int j=0; j<n2; j++){
            right[j] = arr[mid+1+j];
        }

        int temp[] = new int[n1+n2];
        int i=0,j=0,k=0;

        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                temp[k] = left[i];
                i++;
            }
            else{
                temp[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            temp[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            temp[k] = right[j];
            j++;
            k++;
        }
         k=0;
        for( i=0; i<(n1+n2); i++){
            arr[i+s] = temp[k];
            k++;

        }

    }
    public static void divide(int arr[], int s, int e){
        if(s<e){
            int mid = (s+e)/2;

            divide(arr,s,mid);
            divide(arr,mid+1,e);
            merge(arr,s,mid,e);
        }
    }
    public static void main(String[] args){
        int arr[] = {7,13,5,21,8,3,6};
        int n = arr.length;

        divide(arr,0,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
