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
public static void mergeSort(int arr[],int s, int mid, int e){
    int n1 = mid-s+1;
    int n2 = e-mid;

    int left[] = new int[n1];
    int right[] = new int[n2];

    for(int i=0; i<n1; i++){
        left[i] = arr[s+i];
    }
    for(int j=0; j<n2; j++){
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

