package basics.array;

import java.util.Scanner;

public class Code05DisplayFreeQuency {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int positveCount=0 , negativeCount=0,zerosCount = 0 ;
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter elements : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println(arr.length);
		for(int i=0;i<size;i++) {
			if(arr[i]<0) {
				negativeCount++;
				
			}
			if(arr[i] == 0) {
				zerosCount++;
			}
			if(arr[i] >0) {
				positveCount++;
			}
		}
		System.out.println("-ve count : "+negativeCount);
		System.out.println("zeros count : "+zerosCount);
		System.out.println("+ve count : "+positveCount);
		
		sc.close();
	}

}
