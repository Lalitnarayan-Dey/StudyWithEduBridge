package com.stringoperation;

import java.util.Scanner;

public class Code05CountVowelAndConsonant {
	public static void main(String[] args)
    {
			int vowelCount =0,consonantCount =0,numbersCount=0;
        Scanner in =new Scanner (System.in);
        System.out.println("Enter the string");
        String s1 = in.nextLine();
        s1=s1.toLowerCase();
        
        for(int i=0;i<s1.length();i++) {
        	System.out.println(i+" =>  index  =>  "+s1.charAt(i));
        	
        	if(s1.charAt(i) =='a' || s1.charAt(i)=='e'|| s1.charAt(i) =='i' || s1.charAt(i)=='o'|| s1.charAt(i)=='u') {
        		vowelCount++;
        	}
        	else if(s1.charAt(i) >='a' && s1.charAt(i)<='z') {
        		consonantCount++;
        	}
        	else if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
        		numbersCount ++;
        	}
        }
        
        System.out.println("Vowels count : "+vowelCount);
        System.out.println("Consonant count : "+consonantCount);
        System.out.println("Numbers count : "+numbersCount);
      
    }
}
//	5.Program to count total no. of vowels and consonant from a string.