package resultsetmetadata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class ResultSetMetaDataEx {
	
	Connection conn;
	Statement stmt;
	ResultSet rs ; 
	ResultSetMetaData resultSetMetaData;
	
	public ResultSetMetaDataEx() throws FileNotFoundException, IOException, SQLException {
		conn = MyConnection.getConnection();
		System.out.println("Connection opened.");
	}
	public void getInfo() throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student");
		resultSetMetaData = rs.getMetaData();
		System.out.println("No of columns : "+resultSetMetaData.getColumnCount());
		System.out.println("Name Of column where student_name : "+resultSetMetaData.getColumnName(2));
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		ResultSetMetaDataEx obj = new ResultSetMetaDataEx();
		obj.getInfo();
	}

}
