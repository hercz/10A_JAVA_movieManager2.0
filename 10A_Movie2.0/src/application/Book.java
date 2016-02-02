package application;

public class Book extends Product {

	private Person author;

	public Book(String id, String title, Person person, Person author) {
		super(id, title, person);
		this.author = author;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	@Override
	public long getInvestment() {
		// TODO Auto-generated method stub
		return super.getInvestment();
	}

	@Override
	public String toString() {
		return "BOO" + id + " " + title + " " + person + " " + author;
	}
}
