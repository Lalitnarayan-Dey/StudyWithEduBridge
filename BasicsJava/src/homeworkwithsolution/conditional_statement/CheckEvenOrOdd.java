package homeworkwithsolution.conditional_statement;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a number to check even or odd : ");
		int a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a+" : number is Even :");
		}
		else {
			System.out.println(a+" : number is Odd");
		}
		sc.close();

	}

}
