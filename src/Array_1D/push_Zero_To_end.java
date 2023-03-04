package Array_1D;

public class push_Zero_To_end {
    public static void pushZeroToEnd(int arr[], int n){

        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=j; i<n; i++){
            arr[i] = 0;

        }
    }
    public static void main(String[] args){
        int arr[] = {1, 8, 0, 2, 0, 1, 13, 0};
        int n = arr.length;

        pushZeroToEnd(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
