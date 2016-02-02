package application;

import java.util.UUID;

public class IdGenerator {

	public static String generate() {
		String uniqueID = UUID.randomUUID().toString();
		return uniqueID;
	}
}
