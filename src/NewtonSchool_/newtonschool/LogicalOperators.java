package NewtonSchool_.newtonschool;
import java.util.Scanner;
public class LogicalOperators {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// OR operator                                                    //send a gift to a friend
		boolean courier = true;                                           //we can send through two ways either courier service or  
		boolean relativehelp = true;                               //by relative help both of them we check true or false statement
		
		if((courier==true) ||(relativehelp==true)) {
			System.out.println("I can deliver the product");
		}
		
		else {
			System.out.println("I cannot deliver the product");
		
		}
	}

}
