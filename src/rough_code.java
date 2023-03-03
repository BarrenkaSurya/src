import java.util.*;
public class rough_code {
    public static void mergeSort(int arr[],int s, int mid, int e){
        int n1 = mid-s+1;
        int n2 = e-mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[s+i];
        }
        for(int j=0; j<n1; j++){
            right[j] = arr[j+mid+1];
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
        for(i=0; i<(n1+n2); i++){
           arr[i+s] = temp[k];
           k++;

        }

    }
    public static void divide(int arr[], int s, int e){
        if(s<e){
            int mid = (s+e)/2;

            divide(arr,s,mid);
            divide(arr,mid+1,e);
            mergeSort(arr,s,mid,e);
        }
    }
    public static void main(String[] args){
        int arr[] = {8,6,9,4,6,5,2,3,1};
        int n = arr.length;

        divide(arr,0,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
