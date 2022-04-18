package basics.array;

import java.util.Scanner;

public class Code1MultiDimentionalArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][2];
		char ch ;
		
	do {
		
	System.out.println("Enter 2*2 elements");
		//Get the elements of 2*2 matrix from the user
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]= sc.nextInt();
			}
		}
//		Print  all the  elements  in matrix format.
		System.out.print("Printing...\n");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
//		Asking for continue the process or not
		System.out.println("Do you want to play again ? (y/n)");
		ch = sc.next().charAt(0);
	}
	while(ch == 'y' || ch =='Y');
	sc.close();
	}

}
