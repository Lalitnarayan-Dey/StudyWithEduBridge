package classAndObject.staticKeyword;

public class OverLoadingStaticMethod {

	public static void area(float a, float b) {
		System.out.println("Area of rectangele :  " + (a * b));
	}

	public static void area(int a) {
		System.out.println(" area of square : " + (a * a));
	}

	public static void main(String[] args) {
		OverLoadingStaticMethod.area(10, 20);
		OverLoadingStaticMethod.area(5);

	}

}
