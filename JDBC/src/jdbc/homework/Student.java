package jdbc.homework;

public class Student {
	private int id;
	private String name;
	private String email;
	private String phNo;
	private Address address;
	private float sub1;
	private float sub2;
	private float sub3;
	private int totalMark;
	private int percent;
	public Student(int id, String name, String email, String phNo, Address address, float sub1, float sub2, float sub3) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phNo = phNo;
		this.address = address;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public float getSub1() {
		return sub1;
	}
	public void setSub1(float sub1) {
		this.sub1 = sub1;
	}
	public float getSub2() {
		return sub2;
	}
	public void setSub2(float sub2) {
		this.sub2 = sub2;
	}
	public float getSub3() {
		return sub3;
	}
	public void setSub3(float sub3) {
		this.sub3 = sub3;
	}
	public int getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phNo=" + phNo + ", address=" + address
				+ ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", totalMark=" + totalMark + ", percent="
				+ percent + "]";
	}
	
	
}
