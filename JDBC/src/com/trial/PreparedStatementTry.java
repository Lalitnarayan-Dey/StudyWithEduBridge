package com.trial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.MyConnection;

public class PreparedStatementTry {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public PreparedStatementTry() throws FileNotFoundException, IOException, SQLException {
		conn = MyConnection.getConnection();
		System.out.println("** Connection Enabled");
	}
	 public void  getData() throws SQLException, InterruptedException {
		pstmt = conn.prepareStatement("select * from student where percentage between ? and ?");
		pstmt.setFloat(1, 60);
		pstmt.setFloat(2, 90);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int rollNo = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			String phno = rs.getString(4);
			int age = rs.getInt(5);
			float percentage = rs.getFloat(6);
			
			System.out.println(rollNo + "\t" + name + "\t" + address + "\t" + phno + "\t" + age+ "\t" + percentage+"%\n");
			Thread.sleep(2000);
		}
	}
	 public void insertData() throws SQLException {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Name : ");
		 String name = sc.nextLine();
		 System.out.print("Address : ");
		 String address = sc.nextLine();
		 System.out.print("Phone_no : ");
		 String phone_no = sc.nextLine();
		 System.out.print("Age : ");
		 int age = sc.nextInt();
		 System.out.print("Percentage : ");
		 float percentage = sc.nextFloat();
		 System.out.print("Roll_no : ");
		 int roll_no = sc.nextInt();
		 
		 pstmt = conn.prepareStatement("insert into student values(?,?,?,?,?,?)");
		 pstmt.setInt(1, roll_no);
		 pstmt.setString(2, name);
		 pstmt.setString(3, address);
		 pstmt.setString(4, phone_no);
		 pstmt.setInt(5, age);
		 pstmt.setFloat(6, percentage);
		 
		 int i = pstmt.executeUpdate();
		 System.out.println(i+" record is inserted.");
		 
	 }
	
	public static void main(String[] args) throws FileNotFoundException, SQLException, InterruptedException, IOException {
		PreparedStatementTry obj = new PreparedStatementTry();
		obj.getData();
		obj.insertData();
		
	}
}
