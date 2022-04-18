package basics.array;

import java.util.Scanner;

public class Code02SumOfArrayElement {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] numberArray = new int[size];
		
		System.out.println("Enter The elements : ");
		
//		For getting the elements from user.
		for(int i=0; i<size;i++) {
			numberArray[i] = sc.nextInt();	
		}
//		For Display the elements.
		System.out.print("Elements are : ");
		for(int i=0;i<size;i++) {
			System.out.print(numberArray[i]+" ");
			sum = sum+numberArray[i];
		}
		
		System.out.println("\nSum of elements are : "+sum);
		sc.close();
	}

}
