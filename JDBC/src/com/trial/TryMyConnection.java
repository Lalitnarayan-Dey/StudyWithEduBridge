package com.trial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class TryMyConnection extends Thread{
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException, InterruptedException {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		conn = MyConnection.getConnection();
		
		stmt = conn.createStatement();
		
		rs = stmt.executeQuery("select * from student");
		while(rs.next()) {
			
			int rollNo = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			String phno = rs.getString(4);
			int age = rs.getInt(5);

			System.err.println(rollNo + " " + name + " " + address + " " + phno + " " + age);
			Thread.sleep(2000);
			
		}
	}
	
	

}
