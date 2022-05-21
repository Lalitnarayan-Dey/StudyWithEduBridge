package Abstraction.interfaceImpl;

public interface Printable {

	float pi = 3.14f;

	void area();

	static int cube(int a) {
		return a * a * a;
	}

	default int square(int a) {
		return a * a;
	}
}
