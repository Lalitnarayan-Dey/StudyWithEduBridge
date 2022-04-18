package homeworkwithsolution.take_input_fromuser;

import java.util.*;

public class ArithmaticOperation {

	public static void main(String[] args) {
		
		System.out.println("Enter Two Number for performe all arithmatic operation.");
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		
		int addition = a+b;
		int subtraction = a-b;
		int multiplication = a*b;
		int division = a/b;
		int modulus = a%b;
		
		System.out.println("Addition is : "+addition);
		System.out.println("Subtraction is : "+subtraction);
		System.out.println("Multiplication is : "+multiplication);
		System.out.println("Division is : "+division);
		System.out.println("modulus is : "+modulus);
		
		sc.close();

	}

}
