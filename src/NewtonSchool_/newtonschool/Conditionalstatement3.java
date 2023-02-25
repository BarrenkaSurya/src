package NewtonSchool_.newtonschool;
import java.util.Scanner;
public class Conditionalstatement3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// And operator
		boolean isFriendGoing = true;
		int myage = 20;
		
		if((isFriendGoing==true) && (myage>=18)) {
			System.out.println("I am also going to trip");
			
		}
		else {
			System.out.println("I am not going to trip");
			
		}
	}

}
