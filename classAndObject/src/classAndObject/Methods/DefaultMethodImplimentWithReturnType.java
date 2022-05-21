package classAndObject.Methods;

import java.util.Scanner;

public class DefaultMethodImplimentWithReturnType {

	int firstNum,secondNum,sum,sub; // Instance Variable
	
	public static void main(String[] args) {
		
		DefaultMethodImplimentWithReturnType obj = new DefaultMethodImplimentWithReturnType();
		obj.readInput();
		obj.summation();
		obj.subtraction();
	}
	
	public void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two num : ");
			firstNum=sc.nextInt();
			secondNum=sc.nextInt();
		sc.close();
	}
	public void summation(){
		sum = firstNum+secondNum;
		System.out.println("Sum is : "+sum);
	}
	public void subtraction(){
		sub = firstNum-secondNum;
		System.out.println("Subtraction is : "+sub);
	}

}
