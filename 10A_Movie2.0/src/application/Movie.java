package application;

import java.util.ArrayList;

public class Movie extends Product implements Buyable {

	private Genre genre;
	private long duration;
	private double rate;
	private ArrayList<Person> cast;
	private int price;

	public Movie(String id, String title, Person person, Genre genre, long duration, double rate,
			ArrayList<Person> cast) {
		super(id, title, person);
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
		// this.price = price;

	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public ArrayList<Person> getCast() {
		return cast;
	}

	public void setCast(ArrayList<Person> cast) {
		this.cast = cast;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
