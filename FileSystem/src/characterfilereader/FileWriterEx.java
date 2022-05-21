package characterfilereader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args)throws IOException {
		FileWriter write = new FileWriter("D:\\Edubridge\\Codes\\FileHandlingExample\\pqr.txt");
		write.write("Hy my name is Java . . . ");
		write.close();
		System.out.println("File created successfully . . .");
	}

}
