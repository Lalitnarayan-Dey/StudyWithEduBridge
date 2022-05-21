package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) throws IOException {
//		For run the file/ open the file
		FileInputStream input = new FileInputStream("D:\\Edubridge\\Codes\\FileHandlingExample\\abc.txt");
		int i;
		while ((i = input.read()) != -1) {
			System.out.print((char)i);
		}
		input.close();
	}

}
