package basics.loops.for_loop.seriesproblem;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		
//		Q.10 => 10. 1-2 + 3-4 + 5-6... n = ?
		float sum =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range = ");
		float range = sc.nextInt();
		
		if(range%2 == 0) {
		for(float i =1;i<=range;i++) {
			System.out.print(String.format("%.0f", i));
			
				if(i<range) {
					if(i%2==0){
						System.out.print(" + ");
						sum += i;
					}
					else {
						System.out.print(" - ");
						sum +=sum-i;
					}
				}
			}
			
		}
//		
		System.out.print(" = "+String.format("%.0f", sum));
		sc.close();
	}

}
