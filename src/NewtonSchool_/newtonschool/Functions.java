package NewtonSchool_.newtonschool;
import java.util.*;
public class Functions {
	
	
	//In these function we should avoid "main" function after void we can put variable instead of main.
	
	//public static void sum() {
		// Scanner sc= new Scanner(System.in);
		  //  int a= sc.nextInt();
		    //int b= sc.nextInt();                     //functions
		    
	       // int sum=(a+b);
		    //System.out.println(sum);
		//    printworld();
	//}
	   // public static void printworld() {
		 //    System.out.println("Hello world");
	//}
	
	   
	// writing again these function part mean we are tellin g to compiler that we wrote code already outside the function like backend of this
	// and should print ionly sum(); what we wrote in above variable so compiler will automatically and give user input!
	
   //public static void main(String[] args) {
	   
	 //  System.out.println("we are learning functions today: ");
	  // sum();
	    
	   //Scanner sc = new Scanner(System.in);
	   
	  // int result= sc.nextInt();
	   
	   //if(result==1) {
		 //  System.out.println("lets repeat the process: ");
		   //sum();
		   
	   //}else {
		 //  System.out.println("Thank you");
	   //}
//   }
//}
	
	// we can write this code in different way like taking boolean value instead of integer value only in user input if statement.....!
	//public static void conditionalStatements() {
		//Scanner sc= new Scanner(System.in);
		
		//boolean placed = sc.nextBoolean();
		//int age = sc.nextInt();
		 //if(placed==true) {
			// System.out.println("placed in a company");
		 //}
	    //else {
	    	// System.out.println(" not placed in a company");
	     //}
	    //if(age>=18) {
			// System.out.println("welcome to the company");
		 //}
	    //else {
		//	 System.out.println("not eligible for work"); 
			 
			// System.out.println(placed);
			 //System.out.println(age);
		 //} 
		 
		 //public static void main(String[] args) {
			// conditionalstatements();
		 //}
//..............................................................................................................................		    
		   
		    public static void day() {
		    	Scanner sc = new Scanner(System.in);
		    	int day= sc.nextInt();
		    	String datetype;
		    	switch (day){
		    	      case 1:
		    	    	  System.out.println("Monday");
		    	    	  break;
		    	      case 2:
		    	    	  System.out.println("Tuesday");
		    	    	  break;
		    	      case 3:
		    	    	  System.out.println("Wednesday");
		    	    	  break;
		    	      case 4:
		    	    	  System.out.println("Thursday");
		    	    	  break;
		    	      case 5:
		    	    	  System.out.println("Friday");
		    	    	  break;
		    	      case 6:
		    	    	  System.out.println("Saturday");
		    	    	  break;	  
		    	      case 7:
		    	    	  System.out.println("Sunday");
		    	    	  break;
		  	    	default:
			    		System.out.println("Invalid day"); 	  
		    	}
	
		    }
		   
		public static void main(String[] args) {
			System.out.println("select a day in week:");
			day();
		}
		    
		    
		    
		    
		    
		    
		    
		    
   
}