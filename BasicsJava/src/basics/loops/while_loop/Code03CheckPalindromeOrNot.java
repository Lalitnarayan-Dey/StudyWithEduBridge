package basics.loops.while_loop;

import java.util.Scanner;

public class Code03CheckPalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome or not : ");
		int number  = sc.nextInt();
		int tempNumber = number;
		sc.close();
		 
		int reverse = 0, reminder;
		while(tempNumber>0) {
			reminder = tempNumber % 10;
			reverse = (reverse*10)+reminder;
			tempNumber = tempNumber/10;	
		}
		
		if(number == reverse) {
			System.out.println("It is a Palindrome number");
			System.out.println("Because original number '"+number +"' == Reverse Number '"+ reverse+"'");
		}
		else {
			System.out.println("It is not a palindrome number . ");
			System.out.println("Because original number '"+number +"' != Reverse Number '"+ reverse+"'");
		}
	}

}
