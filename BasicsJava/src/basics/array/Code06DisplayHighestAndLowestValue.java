package basics.array;

import java.util.Scanner;

public class Code06DisplayHighestAndLowestValue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int greater =arr[0];
		int smaller =arr[0];
//		Display the elements
		for(int i=0;i<size;i++) {
			if(arr[i] > greater ) {
				greater = arr[i]; 
			}
			if(arr[i] < smaller) {
				smaller = arr[i];
			}
		}
		System.out.println("Bigger value is : "+greater);
		System.out.println("Smaller value is : "+smaller);
		sc.close();
	}

}
