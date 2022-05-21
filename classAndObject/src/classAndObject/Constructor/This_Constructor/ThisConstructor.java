package classAndObject.Constructor.This_Constructor;

public class ThisConstructor {
	String str;
	
	public ThisConstructor() {
		this("Hello, This is the example of this constructor.");
	}
	public ThisConstructor(String str) {
		this.str = str;
	}
	public void print() {
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		ThisConstructor t = new ThisConstructor();
		t.print();
		
	}

}
