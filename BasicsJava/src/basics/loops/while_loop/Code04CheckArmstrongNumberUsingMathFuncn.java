package basics.loops.while_loop;

import java.util.Scanner;

public class Code04CheckArmstrongNumberUsingMathFuncn {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a 3 digits number to check armstrong or not ? ");
		int number = sc.nextInt();
		
		int originalNumber = number ; 
		sc.close();
		
		int reminder ,sum = 0;
		while (number>0) {
			reminder = number % 10;
			sum = sum +(reminder*reminder*reminder);
			number = number/10;	
		}
		if(sum == originalNumber) {
			System.out.println("It is a ArmStrong number :");
		}
		else {
			System.out.println("It is not a armstrong number : ");
		}
		
	}
}
