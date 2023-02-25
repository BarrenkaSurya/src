package NewtonSchool_.newtonschool;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String [] args) {
		
		Scanner sc =  new Scanner(System.in);                              
	
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("you are eligible");
			
		}
		
		
		else {
			System.out.println("you are not eligible");
			
		}

    }
}

