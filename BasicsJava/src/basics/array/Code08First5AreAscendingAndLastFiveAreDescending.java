package basics.array;

import java.util.Scanner;

public class Code08First5AreAscendingAndLastFiveAreDescending {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//	
		int[] arr = new int[10];
		int temp;


		System.out.print("Enter 10 Elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		
		for (int i = 0; i < arr.length/2-1; i++) {
			for (int j = i+1; j < arr.length/2; j++) {
				if (arr[i] > arr[j]) {
				
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = arr.length/2; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
				
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("First 5 Elements are :");
		for(int i=0;i<arr.length/2;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nLast 5 Elements are :");
		for(int i=arr.length/2;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.println("\n Next 5 elements are :");
//		for (int i = arr.length / 2; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		sc.close();
	}
}
