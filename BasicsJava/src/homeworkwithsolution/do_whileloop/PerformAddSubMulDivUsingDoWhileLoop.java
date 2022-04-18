package homeworkwithsolution.do_whileloop;

import java.util.Scanner;

public class PerformAddSubMulDivUsingDoWhileLoop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Choose your operation that u want to performe : \n [+,-,*,/]");
			String choice = sc.next();
			
			switch (choice) {
			case ("+"):
				System.out.println("Addition is : " + (a + b));
				break;
			case ("-"):
				System.out.println("Subtraction is : " + (a - b));
				break;
			case ("*"):
				System.out.println("Multiplication is : " + (a * b));
				break;
			case ("/"):
				System.out.println("Division is : " + (a / b));
				break;
			default:
				System.out.println("Invalid Input That you entered : " + choice);

			}
			System.out.println("Do you want to continue to check ? (y/n)");
			 ch = sc.next().charAt(0);
		}
		while(ch =='y' || ch == 'Y');
		sc.close();
	}

}
