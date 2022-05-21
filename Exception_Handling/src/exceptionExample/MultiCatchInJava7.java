package exceptionExample;



public class MultiCatchInJava7 {
	public static void main(String[] args) {
		
	
	try {
		int[] a = new int[5];
		a[6] = 20/0;
		
	}
//	Java-7 Feature
	catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
		e.printStackTrace();
		
	}
}
}
