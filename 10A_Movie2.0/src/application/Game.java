package application;

import java.util.ArrayList;

public class Game extends Product implements Buyable {
	private boolean preOrdered;
	private ArrayList<Person> staff;
	private int price;

	public Game(String id, String title, Person person, boolean preOrdered, ArrayList<Person> staff, int price) {
		super(id, title, person);
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

	public ArrayList<Person> getStaff() {
		return staff;
	}

	public void setStaff(ArrayList<Person> staff) {
		this.staff = staff;
	}

	@Override
	public int getPrice() {
		return price;
		// TODO Auto-generated method stub

	}

	public void setPrice(int price) {
		this.price = price;
	}

}
