package relationship_and_Inheritance.has_a_relationship;

public class MyDate {

	int dd,mm,yy;
	
	public MyDate(){
		this.dd = 10;
		this.mm = 06;
		this.yy = 2010;
	}
	public MyDate(int d,int m,int y){
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}
	public void display() {
		System.out.println("DOB    : "+dd+"-"+mm+"-"+yy);
	}

}
