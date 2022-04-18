package basics.loops.do_while;

import java.util.Scanner;

public class Code01ToPrint1to100 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range to print the number : ");
		int range = sc.nextInt();
		sc.close();
		int fst = 1;
		do {
			System.out.print(fst+", ");
			fst++;
		}
		while(fst <= range);
	}

}
