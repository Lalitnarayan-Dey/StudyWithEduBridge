package basics.array;

import java.util.Scanner;

public class Code03DisplayEvenElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("Enter the size of an array : ");
		int size =sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//for display the element.
//		for(int i=0;i<size;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		For print the even value 
		System.out.println("\n Even elements are :  ");
		for(int i=0;i<size;i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+" ");
				count++;	
			}	
		}
		if(count == 0) {
			System.out.println("No even elemnts are there");
		}
		sc.close();
		
	}

}
