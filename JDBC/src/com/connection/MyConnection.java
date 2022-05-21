package com.connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {
	static Connection connection;

	public static Connection getConnection() throws FileNotFoundException, IOException, SQLException {
		if (connection == null) {
			Properties properties = new Properties();
			properties.load(new FileInputStream("D:\\Edubridge\\Codes\\JDBC\\src\\com\\properties\\db.properties"));
			String url = properties.getProperty("url");
			String userName = properties.getProperty("username");
			String password = properties.getProperty("password");
			
//			System.out.println(url);
			
			connection = DriverManager.getConnection(url,userName,password);
			return connection ; 
		} else {
			return connection;
		}
	}
}
