package com.stringoperation;

import java.util.Scanner;

public class Code04FindLargestAndSmallestWord {
//	Program to find out largest and smallest word in the string.

	public static void main(String[] args) {
		String lengthOfTheSmallString ,lengthOfTheLargeString;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string...");
		String str = sc.nextLine();
		
		
		String[] splitStrings = str.split(" ");
		 lengthOfTheSmallString =  lengthOfTheLargeString=splitStrings[0];
		 
		 for(int i=0;i<splitStrings.length;i++) {
			 if(lengthOfTheLargeString.length() < splitStrings[i].length()) {
				 lengthOfTheLargeString = splitStrings[i];
			 }
			 if(lengthOfTheSmallString.length() > splitStrings[i].length()) {
				 lengthOfTheSmallString = splitStrings[i];
			 }
		 }
		 System.out.println("Large : "+lengthOfTheLargeString);
		 System.out.println("Small : "+lengthOfTheSmallString);
		 

	}
}
