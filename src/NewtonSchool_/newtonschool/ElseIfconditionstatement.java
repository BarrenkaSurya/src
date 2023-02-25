package NewtonSchool_.newtonschool;
import java.util.Scanner;
public class ElseIfconditionstatement {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int marks = sc.nextInt();
	
		if(marks>=95){
		   System.out.println("A+");
    }	
	
		else  if((marks>=90) &&  (marks<95)) {
		System.out.println("A");
	}
	  
		else if((marks>=85) && (marks<90)) {
		System.out.println("B+");
	}
	
		else if((marks>=80) &&(marks<85)) {
		System.out.println("B");
	}
		else {
			System.out.println("marks is poor");
		}
}
}

