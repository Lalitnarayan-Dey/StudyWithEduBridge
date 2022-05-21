package classAndObject.Methods;

import java.util.Scanner;

public class DefaultMethodImpliment {

	int firstNum,secondNum,sum,sub; // Instance Variable
	
	public static void main(String[] args) {
		
		DefaultMethodImpliment obj = new DefaultMethodImpliment();
		obj.readInput();
		System.out.println("Addition is : "+obj.summation());
		System.out.println("Subtraction is : "+obj.subtraction());;
	}
	
	public void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two num : ");
			firstNum=sc.nextInt();
			secondNum=sc.nextInt();
		sc.close();
	}
	//With return value
	public int summation(){
		sum = firstNum+secondNum;
		return sum;
	}
	//With return value
	public int subtraction(){
		sub = firstNum-secondNum;
		return sub;
	}

}
