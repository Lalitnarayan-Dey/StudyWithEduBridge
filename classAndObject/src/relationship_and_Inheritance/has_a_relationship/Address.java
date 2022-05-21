package relationship_and_Inheritance.has_a_relationship;

public class Address {
	
	int addLine;
	String cityName;
	String state;
	String country;
	int pin;
	
	public Address() {
		this.addLine =    98;
		this.cityName = "Bhubaneswar";
		this.state="Odisha";
		this.country = "India";
		this.pin = 751001;
	}
	public Address(int adl, String cn, String st,String ctry, int p) {
		this.addLine = adl;
		this.cityName = cn;
		this.state = st;
		this.country = ctry;
		this.pin = p;
		
	} 
	public void disp() {
		System.out.println("Address lane (house no:) :  "+addLine);
		System.out.println("City  :  "+cityName);
		System.out.println("State  :  "+state);
		System.out.println("Country  :  "+country);
		System.out.println("pin : "+pin);
	}
	

}
//AddrLine,city,state,country,pincode