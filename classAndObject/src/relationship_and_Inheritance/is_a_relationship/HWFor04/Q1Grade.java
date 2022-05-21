package relationship_and_Inheritance.is_a_relationship.HWFor04;

import relationship_and_Inheritance.has_a_relationship.MyDate;
//import relationship_and_Inheritance.has_a_relationship.Person;

public class Q1Grade extends Q1Student {
	String grade;

	public static void main(String[] args) {
		Q1Grade o = new Q1Grade();
		o.calculatePercentage();
		o.decideGrade();
//		o.decideGrade();
		o.display();
		
		System.out.println("***************************************************8");
		
		Q1Grade g = new Q1Grade(10002,"Lalit",new MyDate(17,02,1999),56,67,98);
		g.calculatePercentage();
		g.decideGrade();
		g.display();

	}
	public Q1Grade() {
		super();
		grade ="A";
	}
	public Q1Grade(int id,String name,MyDate d,int m1,int m2,int m3) {
		super(id, name, d, m1, m2, m3);
	}


	public void decideGrade() {
			if (percentage >= 90) 
				grade ="A+";
			else if (percentage >= 80)
				grade ="A";
			else if (percentage >= 70)
				grade ="B+";
			else if (percentage >= 60)
				grade ="B";
			else if (percentage >= 50)
				grade ="C";
			else
				grade ="D" ;
		}
	public void display() {
		super.display();
		System.out.println("Grade : "+grade);
	}

}
