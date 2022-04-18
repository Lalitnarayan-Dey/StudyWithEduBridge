package basics.array;

import java.util.Scanner;

public class Code04CalculateSumOfevenAndProductOfOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int evenSum =0,oddProduct=1;
		
		
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter ("+size+") elemets of the array");
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Addition of even position : ");
		for(int i=0;i<size;i++) {
			if(arr[i]%2 == 0) {
				evenSum +=arr[i];
			}
			else {
				oddProduct *=arr[i]; 
			}
		}
		System.out.println("Even Sum = "+evenSum);
		System.out.println("Odd Product = "+oddProduct);
		sc.close();
	}

}
