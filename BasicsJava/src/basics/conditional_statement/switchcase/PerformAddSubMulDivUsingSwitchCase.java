package basics.conditional_statement.switchcase;

import java.util.Scanner;

public class PerformAddSubMulDivUsingSwitchCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter your option that you want to perform \n [+,-,*,/]");
		String choice = sc.next();
		sc.close();
		switch(choice) {
		case ("+"):
			System.out.println("Addition is : "+(a+b));
		break;
		case ("-"):
			System.out.println("Subtraction is : "+(a-b));
		break;
		case ("*"):
			System.out.println("Multiplication is : "+(a*b));
		break;
		case ("/"):
			System.out.println("Division is : "+(a/b));
		break;
		default:{
			System.out.println("Invalid Input That you entered : "+choice);
		}
		}
	}

}
