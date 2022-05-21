package seralization_deserialzation;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) throws Throwable, IOException {
		ObjectInputStream objectinput = new ObjectInputStream(new FileInputStream("D:\\Edubridge\\Codes\\FileHandlingExample\\serialization.txt"));
		Student student = (Student)objectinput.readObject();
		
		System.out.println(student);
		
		objectinput.close();
	
		
	}
}
