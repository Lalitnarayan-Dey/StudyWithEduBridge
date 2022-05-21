package classAndObject.staticKeyword;

public class staticMethodAndBlock {
	public static void add(int a, int b) {
		System.out.println("Sum : "+(a+b));
	}
	public static void add(int a) {
		System.out.println(" num^2 : "+(a*a));
	}
	static {
		System.out.println("It executed before main method");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		add(10,20);
		staticMethodAndBlock.add(23,45);
		add(5);
		
	}
}
