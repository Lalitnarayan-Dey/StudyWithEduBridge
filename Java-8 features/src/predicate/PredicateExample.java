package predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Student> predicate1 = s -> s.getName().startsWith("B");
		Predicate<Student> predicate2 = s -> s.getName().startsWith("N") && s.getAge()<=30;
		
		Predicate<Student> predicate3 = s-> s.getAge()<30;
		
		List<Student>list=Student.getStudent();
		
		boolean desc = list.stream().anyMatch(predicate1);
		System.out.println("Predicate p1 with anyMatch() : "+desc);
		
		boolean  d2= list.stream().anyMatch(predicate2);
		System.out.println("Predicate p2 with anyMatch() : "+ d2);
		
		boolean d3 = list.stream().anyMatch(predicate3);
		System.out.println("Predicate p3 with anyMatch() : "+d3);
		
//		Predicate for nonMatch method.
		Predicate<Student> predicate4 = s -> s.getName().startsWith("k");
		Predicate<Student> predicate5 = s -> s.getName().endsWith("t") && s.getAge()<=20;
		
		Predicate<Student> predicate6 = s-> s.getAge() ==30;
		
		boolean b1 =list.stream().noneMatch(predicate4);   // True because in list there is no string which starts with k
		System.out.println("Predicate p4 with noneMatch() : "+b1);
		
		boolean b2 = list.stream().noneMatch(predicate5);
		System.out.println("Predicate p5 with noneMatch() : "+b2);
		
		boolean b3 = list.stream().noneMatch(predicate6);
		System.out.println("Predicate p6 with noneMatch() : "+b3);
		
//		AllMatch()
		Predicate<Student> predicate7 = s -> s.getName().contains("Lalit");
		Predicate<Student> predicate8 = s -> s.getName().contains("t") && s.getAge()<=20;
		
		boolean b4 = list.stream().allMatch(predicate7);
		boolean b5 = list.stream().allMatch(predicate8);
		
		System.out.println(b4);
		System.out.println(b5);
		
		
	}
}
