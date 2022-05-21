package com.stringoperation;

import java.util.Scanner;

public class Code01ForPalindrome {
	public static void main(String[] args)
    {
        String rev="";
        Scanner in =new Scanner (System.in);
        System.out.println("Enter the string");
        String s1 = in.nextLine();
        s1 = s1.toLowerCase();
       
        for(int i = s1.length()-1; i>=0;i--) {
        	rev = rev+s1.charAt(i);
        }
        System.out.println("Reverse string : "+rev);
        System.out.println("Original string : "+s1);
        
        if(s1.equals(rev))
        	System.out.println("Palindrome");
        else
        	System.out.println("Not palindrome");
         in.close();
    }

}
