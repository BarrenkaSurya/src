package NewtonSchool_.newtonschool;
import java.util.Scanner;
public class ScannerArithmeticoperations {
	public static void arithmeticoperations() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first number :");
		 int num1 = sc.nextInt();
		 System.out.println("Enter second number :");
		 int num2 = sc.nextInt();
		 System.out.println("Enter third number :");
		 int num3 = sc.nextInt();
		 
		 int sum = num1 + num2 + num3;
		 int difference = num1 - num2 - num3;
		 int product = num1 * num2 * num3;
		 int quotient = num1 / num2 / num3;
		 
		 
		 System.out.println("sum: "+sum);
		 System.out.println("difference: "+difference);
		 System.out.println("product: "+product);
		 System.out.println("quotient: "+quotient);
		
	}
	//functions!
	public static void main(String[] args) {
		arithmeticoperations();
	}

}
