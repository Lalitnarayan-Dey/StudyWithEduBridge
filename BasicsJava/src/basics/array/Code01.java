package basics.array;

import java.util.Scanner;

public class Code01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of an array __");
		int size =sc.nextInt();
		int[] array = new int[size];
		
		
		System.out.println("Enter the elements of an array __");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Elements are : ");
		System.out.print("[ ");
/*		for(int i=0;i<size-2;i++) {
			System.out.print(array[i]+" ");
			
		}
*/
		for(int i: array) {
			System.out.print(i+" ");
		}
		System.out.print(" ]");

		sc.close();
		}

}
