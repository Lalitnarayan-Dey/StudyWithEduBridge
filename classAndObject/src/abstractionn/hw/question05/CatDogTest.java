package abstractionn.hw.question05;

public class CatDogTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.cats(); //This method gives output because their is a println method
		cat.dogs();  //This method not gives output because their is no body
		
		Dog dog = new Dog();
		dog.dogs(); //This method gives output because their is a println method
		dog.cats();//This method not gives output because their is no body

	}
}
