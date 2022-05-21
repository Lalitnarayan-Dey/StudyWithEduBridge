package com.stringoperation;

import java.util.Scanner;

public class Code06FindFreqOfChar {
	public static void main(String[] args) {
		int freqCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		str = str.toLowerCase();

		System.out.println("Enter a character which you want to count . ");
		char ch = sc.next().charAt(0);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				freqCount++;
			}
		}
		System.out.println("Count of ("+ch+") : "+freqCount);
	}
}
