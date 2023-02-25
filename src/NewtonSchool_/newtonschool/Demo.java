package NewtonSchool_.newtonschool;
import java.util.Scanner; 
public class Demo {
    public static void main(String [] args) {
    	Scanner sc = new Scanner (System.in);

        System.out.println("enter the first number:");
         int num1 = sc.nextInt();
         
         System.out.println("enter the second number:");
         int num2 = sc.nextInt();
         int sum = num1 + num2;
         System.out.println(sum);
         
         
         char alphabet = sc.next().charAt(4);
		 System.out.println(alphabet);
		
         String name = sc.nextLine();
 		System.out.println(name);
    }
    
}


