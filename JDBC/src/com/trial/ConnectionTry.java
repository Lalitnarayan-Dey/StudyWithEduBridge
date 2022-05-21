package com.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTry {

	public static void main(String[] args) {
		Connection con;
		Statement statement;
//		Class.forName("");   // No need to use if mysql version is above 8.0
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridge" + "", "root", "admin");

//			Create statement			
			statement = con.createStatement();
//			Execute statement
			ResultSet rs = statement.executeQuery("select * from student where id=101");

//			retrieve all data
			while (rs.next()) {
				int rollNo = rs.getInt("roll_no");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String phno = rs.getString("phone_no");
				int age = rs.getInt("age");

				System.out.println(rollNo + " " + name + " " + address + " " + phno + " " + age);
			}
			con.close();
			statement.close();

		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

}
