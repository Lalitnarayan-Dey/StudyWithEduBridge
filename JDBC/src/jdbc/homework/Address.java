package jdbc.homework;

public class Address {
	private String lane1;
	private String lane2;
	private String state;
	private int postaCode;
	
	public Address(String lane1, String lane2, String state, int postaCode) {
		this.lane1 = lane1;
		this.lane2 = lane2;
		this.state = state;
		this.postaCode = postaCode;
	}

	public String getLane1() {
		return lane1;
	}

	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}

	public String getLane2() {
		return lane2;
	}

	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostaCode() {
		return postaCode;
	}

	public void setPostaCode(int postaCode) {
		this.postaCode = postaCode;
	}

	@Override
	public String toString() {
		return "lane1 : " + lane1 + ", lane2 : " + lane2 + ", state : " + state + ", postaCode : " + postaCode;
	}
	
	

}
