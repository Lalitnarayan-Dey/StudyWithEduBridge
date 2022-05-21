package Abstraction.interfaceImpl;

public class InterfaceImplementationEx  implements Printable,Drawable{

	public static void main(String[] args) {
		InterfaceImplementationEx ex = new InterfaceImplementationEx();
		ex.area();
		System.out.println("Square = "+ex.square(5));
		System.out.println("Cube = "+Printable.cube(2));
		ex.draw();
		
	}
	public void area() {
		float r =10;
		System.out.println("Area :"+(pi*r*r));
	}
	public void draw() {
		System.out.println("Drawing Circle. . . ");
	}
}
