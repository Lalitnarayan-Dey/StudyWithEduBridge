package exceptionExample;

public class TestCustomException {
		public static void validateAge(int age) throws CustomException{
			if(age>=18)
				System.out.println("Welcome to vote.");
			else
				throw new CustomException("Age is not valid . . .");
		} 
		public static void main(String[] args) {
			try {
				validateAge(17);
			} catch (CustomException e) {
				System.err.println(e);
			}
		}
}
