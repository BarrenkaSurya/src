package NewtonSchool_.newtonschool;
import java.lang.*;
public class Timecomplexity {
	//public static boolean checkPrime(int n) {           // prime numbers are divisible by itself......!
		
		//for(int i=2; i<n; i++) {
			//if(n%i==0) {
				//return false;
			//}
			         //we can also write without else statement it look like clean code!....
	//	}
		//return true;
//	}
   //  public static void main(String[] args) {
  //  	 int num=20;
    //	 System.out.println( checkPrime(num));
     //}
     
     public static boolean checkPrime(int n) {
    	 
    	 for(int i=2; i<=Math.sqrt(n); i++){
    		if(n%i==0) {
    			return false;
    		}
    	 }
    	 return true;
     }
     
     public static void main(String[] args) {
    	 int num=13;
    	 System.out.println(checkPrime(num));
     }
     
     
     
     
     

}
