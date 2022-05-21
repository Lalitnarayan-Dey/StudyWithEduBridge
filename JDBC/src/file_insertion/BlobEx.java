package file_insertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.MyConnection;

public class BlobEx {
	Connection conn;
	PreparedStatement prpstmt;
	ResultSet rs; 
	
	public BlobEx() throws FileNotFoundException, IOException, SQLException {
		conn = MyConnection.getConnection();
		System.out.println("Connection open...");
	}
	public void insertImage() throws SQLException, IOException {
		prpstmt = conn.prepareStatement("insert into img_table values(?,?)");
		prpstmt.setInt(1, 10001);
		FileInputStream fin = new FileInputStream("C:\\Users\\LALIT\\Downloads\\removebg.jpg");
		prpstmt.setBinaryStream(2, fin, fin.available());
		
		int i = prpstmt.executeUpdate();
		System.out.println(i+" record inserted...");
		conn.close();
		
	}
	
	public void getImage() throws SQLException, IOException {
		prpstmt = conn.prepareStatement("select * from img_table");
		rs = prpstmt.executeQuery();
		if(rs.next()) {
			Blob img = rs.getBlob(2);
			byte[] imgByte =img.getBytes(1, (char)img.length());
			FileOutputStream fout = new FileOutputStream("D:\\Edubridge\\removebg.jpg");
			fout.write(imgByte);
			fout.close();
			System.out.println("You get the img in your location");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		BlobEx obj = new BlobEx();
//		obj.insertImage();
		obj.getImage();
	}
	
}
