package classAndObject.methodWithParameter;

import java.util.Scanner;

public class CheckMultipleOption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char yesOrNoChoice;
		CheckMultipleOption obj = new CheckMultipleOption();
		do {
			System.out.println("Enter a number. . . ");
			int number = sc.nextInt();
			System.out.println(
					"What operation do you want to performe :(Please insert 1-4 no.)...  \n "
					+ "1. Check even/odd : \n "
					+ "2. Check for +ve/-ve/zero : \n "
					+ "3. Check Armstrong or not : \n "
					+ "4. Check Palindrome or not :");

			int choice = sc.nextInt();
			switch (choice) {
			
			case (1):
				System.out.println("You choose '" + choice + "' to check even or odd :");
				obj.checkForEvenOdd(number);
				break;
				
			case (2):
				System.out.println("You choose '" + choice + "' to check +ve or -ve or zero :");
				obj.checkPositiveOrNegative(number);
				break;
				
			case (3):
				System.out.println("You choose '" + choice + "' to check Armstrong number :");
				obj.checkArmstrong(number);
				break;
				
			case (4):
				System.out.println("You choose '" + choice + "' to check Palindrome number :");
				obj.checkPalindrome(number);
				break;
				
			default:
				System.out.println("======================\nPlease choose valid option!!!\n======================\n");
			}
			
			System.out.println("Do you want to do more fun ? (y/n)");
			yesOrNoChoice = sc.next().charAt(0);
			
		} while (yesOrNoChoice == 'y' || yesOrNoChoice == 'Y');
		
		System.out.println("************ Thank You, Visit Again ************");
		sc.close();
	}

	public void checkForEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + ": is even :");
		} else {
			System.out.println(num + ": is odd");
		}
	}

	public void checkPositiveOrNegative(int n) {
		if (n > 0)
			System.out.println(n + ": is positive.");
		if (n < 0)
			System.out.println(n + ": is negative.");
		if (n == 0)
			System.out.println(n + ": is zero.");
	}

	public void checkArmstrong(int number) {
		double digitCount = 0, power, sum = 0, remainder;
		int originalNumber = number;
		int temp = number;
		while (number > 0) {
			number /= 10;
			digitCount++;
		}
		while (temp > 0) {
			remainder = temp % 10;
			power = Math.pow(remainder, digitCount);
			sum = sum + power;
			temp /= 10;
		}
		if (sum == originalNumber) {
			System.out.println(originalNumber + ": is a Armstrong number. ");
		} else {
			System.out.println(originalNumber + ": is not a Armstrong number. ");
		}
	}

	public void checkPalindrome(int number) {
		int remainder, reverse = 0;
		int tempNumber = number;
		while (tempNumber > 0) {
			remainder = tempNumber % 10;
			reverse = (reverse * 10) + remainder;
			tempNumber = tempNumber / 10;
		}
		if (number == reverse) {
			System.out.println(number + ": is Palindrome.");
		} else {
			System.out.println(number + ": is not a palindrome.");
		}
	}

}
