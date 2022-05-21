package com.stringoperation;

import java.util.Scanner;

public class Code02RemoveCharacter {
	public static void main(String[] args)
    {
        Scanner in =new Scanner (System.in);
        System.out.println("Enter the string");
        String s1 = in.nextLine();
//        System.out.println(s1);
        
       System.out.println("Enter that position where you want to remove that character");
       int position = in.nextInt();
       
       position = position-1;  		// Because Array always starting from index 0.
       
       String afterRemove = s1.substring(0,position) + s1.substring(position+1);
       System.out.println("Entered string : "+s1);
       System.out.println("After remove the character at index ("+position+") : " +afterRemove);
       
    }

}
