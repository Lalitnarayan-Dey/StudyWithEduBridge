package basics.loops.for_loop.seriesproblem;

import java.util.Scanner;

public class Question11 {
	
	public static void main(String[] args) {
		
//		Q.11 =>  1/1! + 2/2! +  ... + n/n! = ?	
		
		float sum = 0, range, factorial;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of series : ");
		range=sc.nextInt();
		
		for(float i = 1;i<=range;i++) {
			
			factorial =1f;
			for(float j=i;j>0;j--) {
				factorial = factorial*j;
			}

//			Eliminate the ".0f "value
			System.out.print(String.format("%.0f", i)+"/"+String.format("%.0f", i)+"!");
			sum += i/factorial;
			if(i<range) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = "+String.format("%.0f",sum));
		
		
	sc.close();
	}
}

