package application;

import java.util.List;

public class Game extends Product implements Buyable {
	boolean preOrdered;
	List<Person> staff;
	int price;

	public Game(String title, Person person, boolean preOrdered, List<Person> staff, int price) {
		super(title, person);
		this.preOrdered = preOrdered;
		this.staff = staff;
		this.price = price;
	}

	public boolean isPreOrdered() {
		return preOrdered;
	}

	public void setPreOrdered(boolean preOrdered) {
		this.preOrdered = preOrdered;
	}

	public List<Person> getStaff() {
		return staff;
	}

	public void setStaff(List<Person> staff) {
		this.staff = (List<Person>) staff;
	}

	@Override
	public int getPrice() {
		return price;
		// TODO Auto-generated method stub

	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public long getInvestment() {
		long investment = 0;
		for (Person person : staff) {
			investment += person.salary;
		}
		return investment;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
