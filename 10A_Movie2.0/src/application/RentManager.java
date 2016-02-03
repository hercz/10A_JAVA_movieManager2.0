package application;

import java.util.ArrayList;
import java.util.List;

public class RentManager {
	public static void main(String[] args) {
		// PERSONS
		// actors/actresses for movies
		Person a1 = new Person("Jason", "Statham", Gender.MALE, 1155);
		Person a2 = new Person("Silvester", "Stallone", Gender.MALE, 1212);
		Person a3 = new Person("Emma", "Wattson", Gender.FEMALE, 1131);
		Person a4 = new Person("Brad", "Pitt", Gender.MALE, 1140);
		Person a5 = new Person("Angelina", "Jolie", Gender.FEMALE, 2300);

		// staff persons for games
		Person s1 = new Person("Dezso", "Jatekos", Gender.MALE, 110);
		Person s2 = new Person("Boldizsar", "Jatekos", Gender.MALE, 120);
		Person s3 = new Person("Jeno", "Jatekos", Gender.MALE, 130);

		// authors for books
		Person ba1 = new Person("Dezso", "Kosztolanyi", Gender.MALE, 50);
		Person ba2 = new Person("Kalman", "Mikszath", Gender.MALE, 55);
		Person ba3 = new Person("Ferenc", "Mora", Gender.MALE, 52);
		Person ba4 = new Person("Zsigmond", "Moricz", Gender.MALE, 69);

		// customers for products
		Person c1 = new Person("Jakab", "Josua", Gender.MALE, 20);
		Person c2 = new Person("Aranka", "Hogyishivjak", Gender.FEMALE, 12);
		Person c3 = new Person("Nyomo", "Reka", Gender.FEMALE, 22);
		Person c4 = new Person("Kopcos", "Tibor", Gender.MALE, 10);
		Person c5 = new Person("Mathazer", "Imre", Gender.MALE, 18);
		// PERSON TEST
		System.out.println(c1.toString());

		// MOVIES
		List<Person> movie1cast = new ArrayList<Person>();
		movie1cast.add(a1);
		movie1cast.add(a2);
		Product movie1 = new Movie("Mr&Mrs Smith", c2, Genre.ACTION, 120, 8.5, movie1cast, 15);

		List<Person> movie2cast = new ArrayList<Person>();
		movie2cast.add(a3);
		movie2cast.add(a4);
		movie2cast.add(a5);
		Product movie2 = new Movie("Alien", c3, Genre.COMEDY, 120, 8.0, movie2cast, 25);

		// GAMES
		List<Person> game1cast = new ArrayList<Person>();
		game1cast.add(s1);
		game1cast.add(s2);
		Product game1 = new Game("Halo5", c4, false, game1cast, 12);

		List<Person> game2cast = new ArrayList<Person>();
		game2cast.add(s2);
		game2cast.add(s3);
		Product game2 = new Game("Halo6", c5, true, game2cast, 17);

		// BOOKS
		Product book1 = new Book("Egykonyvcim", c1, ba1);
		Product book2 = new Book("Ketkonyvcim", c2, ba2);

	}

}
