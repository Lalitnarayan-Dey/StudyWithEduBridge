package basics.loops.for_loop.seriesproblem;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
//			Print 1 9 25 49 . . . n
		
		System.out.println("Enter range : ");
		Scanner sc = new Scanner(System.in);
		int range=sc.nextInt();
		int result = 0;
		for(int i=1;i<=range;i=i+2) {
			result = i*i;
			
			System.out.print(result+" ");
		}
		sc.close();
	}

}
//2*n-1
