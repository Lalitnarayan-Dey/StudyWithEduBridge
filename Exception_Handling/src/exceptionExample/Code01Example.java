package exceptionExample;

public class Code01Example {

	public static void main(String[] args) {
		try {
			int a=20/0;
			System.out.println(a);
		}
		catch (ArithmeticException e) {
//			System.out.println(e.getMessage()+" Exception Occured ! ! ! ");
			e.printStackTrace();
		}
		
		System.out.println("Rest of codes. . .");
	}
}
