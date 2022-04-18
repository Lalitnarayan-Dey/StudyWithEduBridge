package basics.loops.while_loop;

import java.util.Scanner;

public class Code02ReverseOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number1 =sc.nextInt();
		int number = number1;
		sc.close();
		
		int reverseOfNumber = 0 , reminder;
		while(number > 0) {
			reminder = number%10;
			reverseOfNumber = (reverseOfNumber*10)+reminder ; 
			number = number/10;
			
		}
		System.out.println("Original number is : "+number1);
		System.out.println("Reverse number is : "+reverseOfNumber);
	}

}
