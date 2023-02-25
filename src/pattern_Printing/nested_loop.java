package pattern_Printing;
import java.util.*;
public class nested_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*for(int i=1; i<=n; i++){
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }*/
        for(int i=1; i<=n; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }


    }
}
