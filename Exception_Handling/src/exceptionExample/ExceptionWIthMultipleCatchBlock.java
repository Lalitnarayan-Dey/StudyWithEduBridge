package exceptionExample;

public class ExceptionWIthMultipleCatchBlock {
	public static void main(String[] args) {

		try {
			int[] a = new int[5];
			a[6] = 20/0;

		} 
		catch (ArithmeticException e) {
			System.err.println(e);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
