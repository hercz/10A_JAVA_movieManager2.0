package application;

public class Product {
	protected String id;
	protected String title;
	protected Person person;

	public Product(String id, String title, Person person) {
		this.id = id;
		this.title = title;
		this.person = person;
	}

	public String getTitle() {
		return title;
	}

	public Person getPerson() {
		return person;
	}

	public long getInvestment() {
		return 0; // sum of the
	}

}
