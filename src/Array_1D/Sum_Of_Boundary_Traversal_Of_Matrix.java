package Array_1D;
import java.util.*;
public class Sum_Of_Boundary_Traversal_Of_Matrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int  rows=0;  rows<arr.length;  rows++){
                for(int cols=0; cols<arr[0].length;  cols++){
                    arr[rows][cols]= sc.nextInt();
                }
            }
            int rows = 0;
            int cols = 0;

//        Top side
            int sum1 =0;
            for( cols =0 ; cols < arr[0].length ; cols++ ) {
                System.out.print(arr[rows][cols] +" ");
                sum1 = sum1 +arr[rows][cols];
            }
            cols--;

            int sum2 = 0;
            rows = rows+1;
            for(; rows<arr.length; rows++){
                System.out.print(arr[rows][cols]+" ");
                sum2 = sum2 +arr[rows][cols];
            }
            rows--;

            int sum3=0;
            if(rows>0){
                cols = cols-1;
                for(; cols>=0; cols--){
                    System.out.print(arr[rows][cols]+" ");
                    sum3 = sum3 +arr[rows][cols];
                }
                cols++;
            }

            int sum4 =0;
            if(cols>=0){
                rows =rows-1;
                for(; rows>=1; rows--){
                    System.out.println(arr[rows][cols]+" ");
                    sum4 = sum4 +arr[rows][cols];
                }

            }

            int result = sum1+sum2+sum3+sum4;
            System.out.println(result);



        }
}


