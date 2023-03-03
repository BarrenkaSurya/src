package Array_1D;
import java.util.*;
public class Boundary_traversalOf_Array {
    public static void boundaryTraversal(int arr[][]){
        int row = 0;
        int col = 0;

        for(col=0; col<arr[0].length; col++){
            System.out.print(arr[row][col]+" ");
        }
        col--;

        row = row+1;
        for(; row<arr.length; row++){
            System.out.print(arr[row][col]+" ");
        }
        row--;

        if(row>0) {
            col = col - 1;
            for (; col >= 0; col--) {
                System.out.print(arr[row][col] + " ");
            }
            col++;
        }

        if(col >= 0){
            row = row-1;
            for(; row >0; row--){
                System.out.print(arr[row][col]+" ");
            }

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++){
                arr[row][col]= sc.nextInt();
            }
        }
        boundaryTraversal(arr);

    }
}
