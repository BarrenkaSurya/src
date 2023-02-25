package NewtonSchool_.newtonschool;
import java.util.Scanner;
public class Conditionalstatement4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int marks = sc.nextInt();
	
		if(marks>=95){
		   System.out.println("A+");
    }	
	
	if((marks>=90) &&  (marks<95)) {
		System.out.println("A");
	}
	  
	if((marks>=85) && (marks<90)) {
		System.out.println("B+");
	}
	
	if((marks>=80) &&(marks<85)) {
		System.out.println("B");
	}
	
	}
} 
      
	  
