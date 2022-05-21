package classAndObject.Constructor;

import java.util.Scanner;

public class Code05Student {
	String sName;
	int sId;
	float sub1,sub2,sub3,avg;
	public Code05Student(){
		System.out.println("This is Default constructor,  ");
		this.sId = 10001;
		this.sName = "Lalit";
		this.sub1 = 89;
		this.sub2 = 74;
		this.sub3 = 76;
		
		
	}
	public Code05Student(int sId,String sName,float sub1,float sub2, float sub3) {
		this.sId = sId;
		this.sName = sName;
		this.sub1 =sub1;
		this.sub2=sub2;
		this.sub3 = sub3;
	}
	public void printAndCalculateAvg() {
		
		float securedMarksMarks = sub1+sub2+sub3;
		int fullMarks = 300;
		avg = (securedMarksMarks/fullMarks)*100;
		
		System.out.println("Name : "+sName);
		System.out.println("Id : "+sId);
		System.out.println("Sub1 mark : "+sub1);
		System.out.println("Sub2 mark : "+sub2);
		System.out.println("Sub3 mark : "+sub3);
		System.out.println("Average is : "+avg);
		
	}
	public static void main(String[] args) {
		Code05Student o = new Code05Student();
		o.printAndCalculateAvg();
		System.out.println("*********");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student Id : ");
		int id = sc.nextInt();
		System.out.println("Enter student name : ");
		String name = sc.next();
		System.out.println("Enter marks of three subject : ");
		float s1 = sc.nextFloat();
		float s2 = sc.nextFloat();
		float s3 = sc.nextFloat();
		
		Code05Student o2 = new Code05Student(id,name,s1,s2,s3);
		o2.printAndCalculateAvg();
		
	}

}
