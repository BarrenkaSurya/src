package NewtonSchool_.newtonschool;
import java.util.Scanner;
public class NestedLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// for(int i=1;i<=4; i++ ) {
	    	// for(int j=1; j<6; j++) {
	    		// System.out.print("* ");
	    	 //}
	    	 //System.out.println();
	     //}
	
		    //for(int i=1; i<=6; i++) {                          
		    	//for(int j=1; j<=i; j++ ) {
		    		//System.out.print(j+" ");                   //print pattern of numbers
		    	//}                                                     // 1
		    	//System.out.println();                                  //1 2 
		    //}                                                          //1 2 3
		                                                               //1 2 3 4
		                                                               //1 2 3 4 5 
		
		
		     // int n= sc.nextInt();
		                                                                 //print pattern 
		     // for(int line=1; line<=n; line++) {                                      //1
		    	//  for(int space = 1; space<=(n-line); space++) {          //          2 1
		    		//  System.out.print( " ");                                //      3 2 1
		    	  //}                                                           //  4 3 2 1
		    	 // for(int num=1; num<=line; num++) {
		    		//  System.out.print(num);
		    	 // }
		    	  
		    	  //System.out.println();
		      //}
		
		   
		//for( int i=1; i<=5; i++) {
			//for(int j=1; j<=i; j++) {
				//System.out.print("* ");
		//	}
			//System.out.println();
		//}
		 
		for(int line=1; line<=6; line++) {
			for(int space=1; space<=(6-line); space++) {
				System.out.print("  ");
			}
			for(int k=1; k<=line; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
