package relationship_and_Inheritance.is_a_relationship;

import relationship_and_Inheritance.has_a_relationship.MyDate;

//This class for sales man.
public class MultiLevelInheritance extends SingleLevelInheritsnce{
	float sales, commision,totalSalary;
	public static void main(String[] args) {
		MultiLevelInheritance o = new MultiLevelInheritance();
		o.calculateCommision();
		o.disp();
		System.out.println("******************************************");
		MultiLevelInheritance mli = new MultiLevelInheritance(102,"Lalit",new MyDate(17,02,2020),65,1345.67f,98);
		mli.calculateCommision();
		mli.disp();
		
	}
	/////////////////////////
	public MultiLevelInheritance() {
		super();  //Always use super constructor at the first line of the constructor body.
		this.sales = 78;
	}
	public MultiLevelInheritance(int id,String name,MyDate d,float workingDays,float perDaySal,float sales) {
		super(id,name,d,workingDays,perDaySal);
		this.sales = sales;
	}
	
	public void calculateCommision() {
		super.calculateSalary();
		if(sales >=95)
			commision = salary*0.2f;
		else if(sales >=90) 
			commision =salary* 0.15f;
		else if(sales >=80 ) 
			commision =salary* 0.1f;
		else if(sales >= 75)
			commision =salary* 0.05f;
		else
			commision = 0;
		
		totalSalary = salary+commision;
	}
	@Override
	public void disp() {
		
		super.disp();
		System.out.println("Sales : "+sales+"%");
		System.out.println("Commision : "+commision+" Rs");
		System.out.println("Total Salary ("+salary+" + "+commision+") = "+String.format("%.2f", totalSalary)+" Rs");
	}
}
