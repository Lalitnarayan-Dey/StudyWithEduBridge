package seralization_deserialzation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException {

		Student student = new Student(1000001, "Lalit");
//		to convert the entity class into byte stream
		FileOutputStream out = new FileOutputStream("D:\\Edubridge\\Codes\\FileHandlingExample\\serialization.txt");
		ObjectOutputStream outputStreamObject = new ObjectOutputStream(out);
		outputStreamObject.writeObject(student);
		outputStreamObject.flush();
		System.out.println("Converted. . . ");
		outputStreamObject.close();
	}
}
