package outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx  {
	public static void main(String[] args) throws IOException {
		
//		For creating the file
		FileOutputStream out = new FileOutputStream("D:\\Edubridge\\Codes\\FileHandlingExample\\abc.txt");//true :- used for append(adding) the content with existing file
		String message = "Hello I am a edubridge student.\n My name is Lalit";
		  byte[] bytes= message.getBytes();
		  
		  out.write(bytes);
		  out.close();
		  System.out.println("File created . . .");
		  
//		  System.out.print("Data are :- ");
//		  for(Byte s : bytes) {
//			  System.out.print(s+" ");
//		  }
	}
}
