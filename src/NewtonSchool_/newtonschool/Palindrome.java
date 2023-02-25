package NewtonSchool_.newtonschool;
import java.util.Scanner;
public class Palindrome {
     public static void main(String[] rgs) {
    	 Scanner sc =new Scanner(System.in);
     	int  N= sc.nextInt();
    	
    	 int rev= 0, temp=N;
    	 
    	 while(N>0);
    	 {
     	 int lastdigit=N%10;
    		 rev= rev*10 +lastdigit;
    		 N=N/10;
    		 
    	 }
    	 if(rev==temp) 
    		 System.out.println("True");
    		 
    	 else 
           System.out.println("False");
    	//Scanner sc =new Scanner(System.in);
    //	int  N= sc.nextInt();
    	 
    	//int rev=0, temp = N; 
    	 //while(N > 0)
  	//   {
  		//   int digit = N%10;
  		 //  rev = rev*10 + digit;
  		   //N = N/10;
  	   //}

  	   //if (rev == temp)
  	     //   System.out.println("True");
  	  //else
  	   // System.out.println("False");	
  	}
}