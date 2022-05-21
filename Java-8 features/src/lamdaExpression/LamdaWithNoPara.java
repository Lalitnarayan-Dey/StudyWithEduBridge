package lamdaExpression;
//@FunctionalInterface
interface Sayable{
	public String sayHello();
}
public class LamdaWithNoPara {
	public static void main(String[] args) {
		Sayable s1 = () -> {
			return "Hello User";
		};
		System.out.println(s1.sayHello());
	}

}
