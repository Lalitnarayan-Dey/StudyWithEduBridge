package jdbc.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AllStudentOperation {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	
	public Connection getConnection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridge","root","admin");
			return conn;
	}
	public boolean addStudent(Student studentDetails) throws SQLException {
		boolean check = false;
		
		int id = studentDetails.getId();
		String name = studentDetails.getName();
		String email = studentDetails.getEmail();
		String phNo = studentDetails.getPhNo();
		Address add = studentDetails.getAddress();
		String address = add.toString();
		float sub1 = studentDetails.getSub1();
		float sub2 = studentDetails.getSub2();
		float sub3 = studentDetails.getSub3();
		float totalMark = sub1+sub2+sub3;
		float percentage = totalMark/3;
		
			pstmt= conn.prepareStatement("insert into student_hw(id,name,email,phoneNo,address,sub1,sub2,sub3,totalMark,percent) values(?,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setInt(1,id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, phNo);
			pstmt.setString(5, address);
			pstmt.setFloat(6, sub1);
			pstmt.setFloat(7, sub2);
			pstmt.setFloat(8, sub3);
			pstmt.setFloat(9, totalMark);
			pstmt.setFloat(10, percentage);
			
			int i = pstmt.executeUpdate();
			if(i!=0)
			check = true;	
			
//			conn.close();
		 return check;
	}

	public void viewAllStudentDetails() throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student_hw");
//		System.out.println(rs);
		System.out.format("%5s%15s%25s%20s%50s%59s%15s%12s%15s%15s","SID","Student_Name","Student_Email","Student_Phone","Student_Address","Subject1","Subject2","Subject3","Total_Mark","Percentage");
		System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String phNo = rs.getString(4);
			String address = rs.getString(5);
			float  sub1= rs.getFloat(6);
			float  sub2= rs.getFloat(7);
			float  sub3= rs.getFloat(8);
			float totalMark = rs.getFloat(9);
			float percent = rs.getFloat(10);
			
			System.out.format(" | %1s%10s%30s%18s%95s%14s%15s%15s%13s%19s",id,name,email,phNo,address,sub1,sub2,sub3,totalMark,percent+"\n | \n");	
		}
		System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//	conn.close();	
	}

	public boolean viewStudentDetailsByID(int searchId) throws SQLException {
		boolean f =false;
//		int id = searchId;
		pstmt = conn.prepareStatement("Select * from student_hw where id = ?");
		pstmt.setInt(1, searchId);
		rs = pstmt.executeQuery();
		System.out.format("%5s%15s%25s%20s%50s%59s%15s%12s%15s%15s","SID","Student_Name","Student_Email","Student_Phone","Student_Address","Subject1","Subject2","Subject3","Total_Mark","Percentage");
		System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		while (rs.next()) {
			
			if (rs.getInt(1) == searchId) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phNo = rs.getString(4);
				String address = rs.getString(5);
				float sub1 = rs.getFloat(6);
				float sub2 = rs.getFloat(7);
				float sub3 = rs.getFloat(8);
				float totalMark = rs.getFloat(9);
				float percent = rs.getFloat(10);
				System.out.format(" | %1s%10s%30s%18s%95s%14s%15s%15s%13s%19s",id,name,email,phNo,address,sub1,sub2,sub3,totalMark,percent+"\n | \n");	
				System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
				f = true;
			}
		}
		
		return f;
	}

	public boolean updateDetailsByID(int updateId) throws SQLException {
		boolean f = false;
		Scanner sc = new Scanner(System.in);
		int id = 0;
		pstmt = conn.prepareStatement("select * from student_hw where id = ?");
		pstmt.setInt(1, updateId);
		rs = pstmt.executeQuery();

		while (rs.next()) {
			if (rs.getInt(1) == updateId) {
				id = rs.getInt(1);
			}
		}
		if (id == updateId) {
			System.out.print("Name : ");
			String name = sc.nextLine();
			System.out.print("Email : ");
			String email = sc.nextLine();
			System.out.print("Phone No : ");
			String phNo = sc.nextLine();
			System.out.print("Lane-1 : ");
			String lane1 = sc.nextLine();
			System.out.print("Lane 2 : ");
			String lane2 = sc.nextLine();
			System.out.print("State : ");
			String state = sc.nextLine();
			System.out.print("Postal Code : ");
			int postalCode = sc.nextInt();
			Address add = new Address(lane1, lane2, state, postalCode);
			String address = add.toString();

			System.out.print("Enter mark of subject-1 : ");
			float sub1 = sc.nextFloat();
			System.out.print("Enter mark of subject-2 : ");
			float sub2 = sc.nextFloat();
			System.out.print("Enter mark of subject-3 : ");
			float sub3 = sc.nextFloat();
			

			float totalMark = sub1+sub2+sub3;
			float percentage = totalMark/3;

			pstmt = conn.prepareStatement("update student_hw set id=?,name=?,email=?,phoneNo=?,address=?,sub1=?,sub2=?,sub3=? where id = " + id);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, phNo);
			pstmt.setString(5, address);
			pstmt.setFloat(6, sub1);
			pstmt.setFloat(7, sub2);
			pstmt.setFloat(8, sub3);
			pstmt.setFloat(9, totalMark);
			pstmt.setFloat(10, percentage);
			
			pstmt.executeUpdate();
			f = true;

		}
		return f;
	}
	public int deleteStudentByID(int deleteId) throws SQLException {
		pstmt = conn.prepareStatement("delete from student_hw where id = ?");
		pstmt.setInt(1, deleteId);
		int i = pstmt.executeUpdate();
		
		return i;
		
	}
	public void findRecordsWithRange(int minValue, int maxValue) throws SQLException {
		pstmt = conn.prepareStatement("select * from student_hw where percent between "+minValue+" and "+maxValue);
		rs = pstmt.executeQuery();
		System.out.format("%5s%15s%25s%20s%50s%59s%15s%12s%15s%15s","SID","Student_Name","Student_Email","Student_Phone","Student_Address","Subject1","Subject2","Subject3","Total_Mark","Percentage");
		System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String phNo = rs.getString(4);
			String address = rs.getString(5);
			float sub1 = rs.getFloat(6);
			float sub2 = rs.getFloat(7);
			float sub3 = rs.getFloat(8);
			float totalMark = rs.getFloat(9);
			float percent = rs.getFloat(10);
			System.out.format(" | %1s%10s%30s%18s%95s%14s%15s%15s%13s%19s",id,name,email,phNo,address,sub1,sub2,sub3,totalMark,percent+"\n | \n");
		}
		System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
	}
	public void getSamePercentageStudent() throws SQLException {
		pstmt = conn.prepareStatement("select * from student_hw group by percent ");
		rs = pstmt.executeQuery();
		System.out.format("%5s%15s%25s%20s%50s%59s%15s%12s%15s%15s","SID","Student_Name","Student_Email","Student_Phone","Student_Address","Subject1","Subject2","Subject3","Total_Mark","Percentage");
		System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String phNo = rs.getString(4);
			String address = rs.getString(5);
			float sub1 = rs.getFloat(6);
			float sub2 = rs.getFloat(7);
			float sub3 = rs.getFloat(8);
			float totalMark = rs.getFloat(9);
			float percent = rs.getFloat(10);
			System.out.format(" | %1s%10s%30s%18s%95s%14s%15s%15s%13s%19s",id,name,email,phNo,address,sub1,sub2,sub3,totalMark,percent+"\n | \n");
		}
		System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
	}

}
