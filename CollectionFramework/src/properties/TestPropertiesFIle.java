package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesFIle {
	public static void main(String[] args) throws IOException {
		
		try {
//			Create the object of fileReader class for read the file of properties
				FileReader reader = new FileReader("D:\\Edubridge\\Codes\\CollectionFramework\\src\\properties\\db.properties");
//				Create the object of properties class for accessing the data of that file
				Properties properties = new Properties();
				
//				Read the all key and value pair, who are exist inside the properties file
				properties.load(reader);
				
//				getProperty(key) method return the value with corresponding key
				System.out.println("Username = "+properties.getProperty("username"));
				System.out.println("Password = "+properties.getProperty("password"));
				
				
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		}
	}

}
