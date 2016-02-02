package application;

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

		// Game g1 = new Game()
		// GAMES

		// BOOKS
		Book book1 = new Book(IdGenerator.generate(), "szazevesember...", c1, ba1);

		System.out.println(book1.toString());
	}

}
