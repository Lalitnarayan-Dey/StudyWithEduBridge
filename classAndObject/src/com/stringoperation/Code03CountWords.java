package com.stringoperation;

import java.util.Scanner;

public class Code03CountWords {
	public static void main(String[] args)
    {
			int count =0;
        Scanner in =new Scanner (System.in);
        System.out.println("Enter the string");
        String s1 = in.nextLine();
        
        String[] spltString = s1.split(" ");
        
        
        for(int i=0; i<spltString.length;i++) {
        	count++;
        }
        System.out.println("No of words : "+count);
    }
}
//3.Program to count no. of words in a string.