package basics.loops.while_loop;

import java.util.Scanner;

public class Code01SumOfDigits {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number  = sc.nextInt();
		sc.close();
		int sum=0 , reminder;
		while(number > 0 ) {
			reminder = number % 10;
			sum =sum + reminder ; 
			number = number/10;
		}
		System.out.println("Sum of digits is : "+sum);
		
	}

}
