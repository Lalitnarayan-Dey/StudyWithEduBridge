package exceptionExample;

public class FinallyExample {

	public static void main(String[] args) {
		System.out.println("Case 1 : where exception does not occur.");

		try {
			int x = 25 / 5;
			System.out.println("x = " + x);
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} finally {
			System.out.println("Case 1 : Finally block is always executed.");
		}
		System.out.println("Rest of code . . .");

		System.out.println("\n case 2 : WHere exception occurs and handled.");
		try {
			int[] a = new int[5];
			a[7] = 15;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Case 2 : Finally block always executed.");
		}
		System.out.println("Rest of code . . .");
		System.out.println("\n Case 3 : Where exception occurs and doesn't handled.");

		try {
			String s = "abc";
			System.out.println(Integer.parseInt(s));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				System.out.println("Finally block is always executed. . . ");
		}
		
		System.out.println("Case 3 : Rest of code. . .");
	}
}
