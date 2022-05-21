package exceptionExample;

public class ThrowException {
	
	public static void validateAge(int x) {
		if(x >= 18)
			System.out.println("Welcome to vote...");
		else
			throw new ArithmeticException("Age is not valid");
	}
	public static void main(String[] args) {
		try {
			validateAge(12);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.err.println(e);
		}
		System.out.println("Rest of code. . . ");
	}

}
