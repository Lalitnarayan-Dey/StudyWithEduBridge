package file_insertion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.MyConnection;

public class ClobEx {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	public ClobEx() throws FileNotFoundException, IOException, SQLException {
		conn = MyConnection.getConnection();
		System.out.println("Connection opened \n");
	}
	public void insertTextFile() throws SQLException, FileNotFoundException {
		ps = conn.prepareStatement("insert into text_file values(?,?)");
		ps.setInt(1, 10001);
		
		File textFile = new File("D:\\Edubridge\\Core-Java Project.txt");
		FileReader reader = new FileReader(textFile);
		ps.setCharacterStream(2, reader, textFile.length());
		int i = ps.executeUpdate();
		System.out.println(i+" record inserted.");
	}
	public void getTextFile() throws SQLException, IOException {
		ps = conn.prepareStatement("select * from text_file");
		rs = ps.executeQuery();
		rs.next();
		
		Clob c = rs.getClob(2);
		Reader reader = c.getCharacterStream();
		FileWriter writer = new FileWriter("D:\\\\Edubridge\\\\New_file.txt");
		int i;
		while((i = reader.read())!= -1) {
			writer.write((char)i);
		}
		writer.close();
		conn.close();
		System.out.println("Success");
		
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		ClobEx obj = new ClobEx();
//		obj.insertTextFile();
		obj.getTextFile();
	}
}
