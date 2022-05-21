package classAndObject.Constructor;

public class Code02AreaOfCircle {
	float pi =3.141f;
	float radius;
	public Code02AreaOfCircle(){
		this.radius = 12;
	}
	public Code02AreaOfCircle(float r) {
		this .radius = r;
	}
	public void area() {
		float area = pi*radius*radius;
		System.out.println("Area : "+area);
	}
	public static void main(String[] args) {
		Code02AreaOfCircle obj = new Code02AreaOfCircle();
		obj.area();
		Code02AreaOfCircle obj2 = new Code02AreaOfCircle(5.9f);
		obj2.area();
	}

}
