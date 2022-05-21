package relationship_and_Inheritance.has_a_relationship;

public class Employee {
	

	int id;
	String name;
	MyDate dt ;
	Address add;
		
	public Employee() {
	this.id = 1110011;
	this.name = "Laxman";
	dt = new MyDate();
	add = new Address();
	}
	
	
	public Employee(int id, String name, MyDate dt, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.dt = dt;
		this.add = add;
	}


	public void disp() {
		System.out.println("Employye Id :"+id);
		System.out.println("Employee Name :"+name);
		System.out.print("Date of Joining :");
		dt.display();
		System.out.println("\n\tAddress : ");
		add.disp();
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.disp();
		System.out.println("---------------------------------------------------------------------------------------");
		Employee emp2 = new Employee(11100012,"Ram",new MyDate(1,1,2022),new Address(76,"Banglore","Karnataka","India",123456));
		emp2.disp();
		

	}

}
//Q2) Employee : id,name,doj(MyDate),address(Address),
//disp(emp details.)