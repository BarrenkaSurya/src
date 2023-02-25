import java.util.*;
public class Main {

    /* public static int addOne(int n){
         int mask=1;
         while((n&mask)>0){
             n=n^mask;
             mask=mask<<1;
         }

         n=n^mask;
         return n;
     }
     public static void main(String[] args) {
         int n=39;
         int result=addOne(n);
         System.out.println(result);
     }*/
    /*static int n = 1000002;
    static boolean isPrime[] = new boolean[n];

    static void findPrimes() {
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        // 100 -> 10
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = (i * i); j < n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        findPrimes();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            boolean ans = false;
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int x = 2; x < 1000002; x++) {
                if (isPrime[x]) {
                    double pow = Math.pow(x, m);
                    if (pow == n) {
                        ans = true;
                        break;
                    }
                }
            }
            if (ans) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }*/
//..........................................................................................................
        /*public static void main(String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(a[i], max);
            }
            int low = 0;
            int high = max;
            int ans = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (possible(a, mid, k)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            System.out.print(ans);
        }

        static boolean possible(int a[], int cut, int maxWoodtoCollect) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += Math.max(a[i] - cut, 0);

            }
            return sum <= maxWoodtoCollect;


        }*/
//............................................................................................................................

//public class quick_Sort {
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int findPivotPos(int arr[],int s, int e){
        int Pivot = arr[e];
        int i = s-1;

        for(int k=s; k<e; k++){               //{10,8,6,1,5,9,7};
            if(arr[k] < Pivot){
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
    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args){
        int arr[] = {10,8,6,1,5,9,7};
        int n = arr.length;

        quickSort(arr,0,n-1);
        printArray(arr,n);
    }
}

