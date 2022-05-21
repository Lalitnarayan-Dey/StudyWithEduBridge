package characterfilewriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args)throws IOException {
		FileReader reader = new FileReader("D:\\Edubridge\\Codes\\FileHandlingExample\\pqr.txt");
		
		int i=0;
		while((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
	}

}
