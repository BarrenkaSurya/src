package NewtonSchool_.newtonschool;
import java.util.Scanner;
public class Datatypes {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
        
		String  s1 = sc.nextLine();
		Short   s2 = sc.nextShort();
		Byte   b =   sc.nextByte();
		Long   L =   sc.nextLong();
		Float  f =   sc.nextFloat();
		char   d =   sc.next().charAt(0);
		double s =   sc.nextDouble();
		int  i  =    sc.nextInt();
		boolean y =    sc.nextBoolean();
		
		
		System.out.println("String value is: "+s1);
		System.out.println("short valu is: "+s2);
		System.out.println("Byte value is: "+b);
		System.out.println("Long value is: "+L);
		System.out.println("Float value is: "+f);
		System.out.println("chr value is: "+d);
		System.out.println("double value is: "+s);
		System.out.println("int value is: "+i);
		System.out.println("boolean value is: "+y);
		
	}

}
