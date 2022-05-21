package com.trial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.connection.MyConnection;
import com.mysql.cj.jdbc.CallableStatement;

public class CallableEx {
	Connection conn;
	java.sql.CallableStatement callblestmt ;
	
	public CallableEx() throws FileNotFoundException, IOException, SQLException {
		conn = MyConnection.getConnection();
		System.out.println("Connection enable. ");
	}
	public void callP() throws SQLException {
		callblestmt = conn.prepareCall("{call insertRecord(?,?)}");
		callblestmt.setInt(1,501 );
		callblestmt.setString(2,"Lalit" );
		callblestmt.execute();
		System.out.println("Success...");
	}
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		CallableEx obj = new CallableEx();
		obj.callP();
	}
}
