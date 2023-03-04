public class rough_code{
    public static void swap(int arr[],int a, int b){
        int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }
    public static int findPivotPos(int arr[], int s, int e){
        int Pivot = arr[e];
        int i = s-1;

        for(int k =s; k<e; k++){
            if(arr[k] <Pivot){
                i++;
                swap(arr,i,k);
            }
        }
        i++;
        swap(arr,i,e);
        return i;

    }
    public static void quickSort(int arr[], int s, int e){
        if(s<e){
            int Pos = findPivotPos(arr,s,e);
            quickSort(arr,s,Pos-1);
            quickSort(arr,Pos+1,e);

        }

    }
    public static void printArray(int arr[] , int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {3,8,5,0,1,10,43,20,90,30,};
        int n = arr.length;

        printArray(arr,n);
        quickSort(arr,0,n-1);
        printArray(arr,n);


    }
}