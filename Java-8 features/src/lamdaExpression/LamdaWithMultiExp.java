package lamdaExpression;
interface Addable{
	public int add(int a, int b);
}
public class LamdaWithMultiExp {
	public static void main(String[] args) {
		Addable add = (num1,num2) ->{
			return num1+num2;
		};
		Addable add2 = (p,q) -> p+q;	
		
		System.out.println("Add : "+add.add(10,43));
		System.out.println("Add : "+add2.add(120, 8));
	}
}
