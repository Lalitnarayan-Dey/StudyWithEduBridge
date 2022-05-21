package com.stringoperation;

import java.util.Scanner;

public class Code07CheckForAnagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string");
		String s1 = sc.next();
//		sc.next();
		String s2 = sc.next();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		System.out.println("You entered Two strings :  "+s1 +" and "+s2);

		Code07CheckForAnagram o = new Code07CheckForAnagram();
		o.checkAnagram(s1, s2);

	}

	public void checkAnagram(String s1, String s2) {
		if(s1.length() != s2.length())
			System.out.println("Strings a3r not anagram : ");
		else {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					
					if(s1.charAt(i) == s2.charAt(j)) {
						s2 = s2.substring(0,j)+s2.substring(j+1);
						break;
					}
				}
			}
			if(s2.length() == 0) {
				System.out.println("Strings are anagram");
			}
			else {
				System.out.println("Strings are not anagram");
			}
		}
	}
}
//7.Program to determine whether 2 strings are anagram or not .

//For first string			
//for (int i = 0; i < arS1.length - 1; i++) {
//	for (int j = i + 1; j < arS1.length; j++) {
//		if (arS1[i] > arS1[j]) {
//			temp = arS1[i];
//			arS1[i] = arS1[j];
//			arS1[j] = temp;
//		}
//	}
//}
////			for second string
//for (int i = 0; i < arS2.length - 1; i++) {
//	for (int j = i + 1; j < arS2.length; j++) {
//
//		if (arS2[i] > arS2[j]) {
//			temp = arS2[i];
//			arS2[i] = arS2[j];
//			arS2[j] = temp;
//		}
//	}
//}		
//
//if(arS1 == arS2) {
//	checkStatus = true;
//}
//else
//	checkStatus= false;
//
//System.out.println("Strings are anagram :"+s1+" "+s2);
////System.out.println("First string after sorting :");
////for (int i = 0; i < arS1.length; i++) {
////	System.out.print(arS1[i] + " ");
////}
////System.out.println();
////System.out.println("Second string after sorting :");
////for (int i = 0; i < arS2.length; i++) {
////	System.out.print(arS2[i] + " ");
////}
