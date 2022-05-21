package classAndObject.methodWithParameter;

import java.util.Scanner;


public class PerformAllArithmaticOperation {

int firstNum,secondNum,sum,sub,mul,div; // Instance Variable
	
	public static void main(String[] args) {
		
		PerformAllArithmaticOperation obj = new PerformAllArithmaticOperation();
		obj.readInput();
		obj.summation();
		obj.subtraction();
		int multiply = obj.multiplication();
		double division = obj.division();
		System.out.println("multiplication is : "+multiply);
		System.out.println("Division is : "+division);
	}
	
	public void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two num : ");
			firstNum=sc.nextInt();
			secondNum=sc.nextInt();
		sc.close();
	}
//	Without returning value.
	public void summation(){
		sum = firstNum+secondNum;
		System.out.println("Sum is : "+sum);
	}
	public void subtraction(){
		sub = firstNum-secondNum;
		System.out.println("Subtraction is : "+sub);
	}
	
//	Returning value
	public int multiplication(){
		mul = firstNum*secondNum;
		return mul;
	}
	public double division(){
		div = firstNum/secondNum;
		return div ;
	}

}
