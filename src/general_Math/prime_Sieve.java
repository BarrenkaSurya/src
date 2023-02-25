package general_Math;
import java.util.*;
public class prime_Sieve {
    public static void main(String[] args){

        boolean sieve[] = new boolean[1000];
        for(int i=0; i<1000; i++){
            sieve[i] = true;
        }

        for(int i=2; i*i<1000; i++) {
            if (sieve[i] == true){
                for (int j = i * i; j < 1000; j = j + i) {
                    sieve[j] = false;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            if(sieve[n]==true){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not a prime");
            }
        }
    }
}
