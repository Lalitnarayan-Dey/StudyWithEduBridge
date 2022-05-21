package classAndObject.staticKeyword;

public class StaticKey {
	int id;
	String name;
	static String collegeName = "D.Y Patil";
	
	public StaticKey(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void display(){
		System.out.println("Id : "+id+", Name : "+name+", College-Name : "+collegeName);
	}
	public static void main(String[] args) {
		StaticKey s1 = new StaticKey(10001, "Lalit");
//		collegeName = "XYZ";
		s1.display();
		
		StaticKey s2 = new StaticKey(10002,"Ajay");
		s2.display();
	}
}
