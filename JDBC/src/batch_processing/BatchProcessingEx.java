package batch_processing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class BatchProcessingEx {
	Connection conn;
	Statement stmt; 
	
	public BatchProcessingEx() throws FileNotFoundException, IOException, SQLException {
		conn = MyConnection.getConnection();
		System.out.println("Connection opened.");
	}
	
	public void addBatch() throws SQLException {
		conn.setAutoCommit(false);
		stmt = conn.createStatement();
		stmt.addBatch("insert into student values(1011,'Xyz','kol','789056',24,78.65)");
		stmt.addBatch("insert into student values(2011,'ABC','BLR','78456376',28,98.65)");
		stmt.addBatch("insert into student values(3031,'Pqr','CHE','472446',30,58.65)");
		
		stmt.executeBatch();
		conn.commit();
		conn.close();
		System.out.println("Datas are inserrted successfully");
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		BatchProcessingEx obj = new BatchProcessingEx();
		obj.addBatch();
	}
}
