package oops.encapabstract;

class Author {
	
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.setName(name);
		this.setEmail(email);
		this.setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString()
	{
		return "Name: " + name + ", Email: " + email + ", gender: " + gender;
	}

}
	
class Book {
	
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock) {
		
		this.author = author;
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	public String toString()
	{
		return "Name: " + name + ", Author " + author + ", Price: " + price + ", QtyInStock: " + qtyInStock;
	}
}

public class q1 {
	
	public static void main (String[] args) {
	
	Author object = new Author("Mikhael Lermontov", "Lerm@gmail.com", 'M');
	Book obj = new Book("A Hero of Our Time", object, 1400.00, 54);
	System.out.print(obj);
	
	}
}
