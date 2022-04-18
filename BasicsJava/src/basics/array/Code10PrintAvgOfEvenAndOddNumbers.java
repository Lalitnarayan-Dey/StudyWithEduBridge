package basics.array;

import java.util.Scanner;

public class Code10PrintAvgOfEvenAndOddNumbers {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter range of the array : ");
		int range = in.nextInt();
		float evenAvg = 0,oddAvg = 0;
		int evenCount=0,oddCount=0;
		int evenSum=0,oddSum = 0;
		int[] arr = new int[range];
		
		System.out.println("Enter elements of the array : ");
		for(int i = 0; i<range ; i++){
			arr[i]=in.nextInt();
		}
		//For calculation even avg
		for(int i = 0; i<range;i++) {
			if(arr[i]%2 == 0) {
				evenCount++;
				evenSum += arr[i];
				evenAvg = evenSum/evenCount;
			}
			//For calculation odd avg
			if(arr[i]%2 !=0) {
				
				oddCount++;
				oddSum +=arr[i];
				oddAvg = oddSum/oddCount;
			}
		}
//		System.out.println("Even count = "+evenSum);
//		System.out.println("Odd count = "+oddSum);
		
		System.out.println("Even avg ("+evenSum+"/"+evenCount+") = "+evenAvg);
		System.out.println("Odd avg  ("+oddSum+"/"+oddCount+") ="+oddAvg);
		in.close();
	}
}
