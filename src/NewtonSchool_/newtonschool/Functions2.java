package NewtonSchool_.newtonschool;
import java.util.*;
public class Functions2 {
//public static void printNaturalNumbers(int n ) {
		
		//for(int i=1; i<=n; i++) {
			//System.out.print(i+ " ");
		//}
	//	System.out.println();
		//}
		
		//public static void main(String[] args) {
			//System.out.println("lets find total numbers");
			//printNaturalNumbers(20);
			//printNaturalNumbers(30);
	
	
	
	   static void printpattern( int n) {
		   Scanner sc= new Scanner(System.in);
		 
		   for(int i=1; i<=5; i++) {
			   for(int j=1; j<=i; j++) {
				  System.out.print("* "); 
			   }
		   }
		   System.out.println();
	   }
	
	   public static void main(String[] args) {
		   
		   printpattern(5);
		   
	   }
	}
	
	
	
	
	
	
		

