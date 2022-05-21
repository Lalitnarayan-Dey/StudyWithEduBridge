package classAndObject.Constructor;

import java.util.Scanner;

public class Code03AreaOfTringle {
	float base;
	float height;
	public Code03AreaOfTringle(){
		this.base = 12f;
		this.height=45f;
	}
	public Code03AreaOfTringle(float b,float h) {
		this .base = b;
		this.height=h;
	}
	public void area() {
		float area = 0.5f*base*height;
		System.out.println("Area : "+area);
	}
	public static void main(String[] args) {
		Code03AreaOfTringle obj = new Code03AreaOfTringle();
		obj.area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height : ");
		float base =sc.nextFloat();
		float height = sc.nextFloat();
		Code03AreaOfTringle obj2 = new Code03AreaOfTringle(base,height);
		obj2.area();
	}

}
