package map;

public class CustomerDetails {
	
	int  id;
	String name;
	
	CustomerDetails(Integer id,String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return " [ id => " + id + ", name => " + name + " ]";
	}
	
	

}
