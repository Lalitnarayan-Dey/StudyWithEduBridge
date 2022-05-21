package map.hashtable;

public class Book {
	public int id;
	public String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher,int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "              Book [id=" + id + ", quantity=" + quantity + ", name=" + name + ", author=" + author + ", publisher="
				+ publisher + "]";
	}
	
	

}
// Power of uncousious mind