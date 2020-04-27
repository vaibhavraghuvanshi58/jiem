package assignments_wap;

import java.security.SecureRandom;
import java.util.Random;

public class StringRandom {
	public static void main(String[] args) {
		String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
		String CHAR_UPPER = CHAR_LOWER.toUpperCase();
		String digits = "0123456789";
		String combination = CHAR_LOWER + CHAR_UPPER + digits;
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 6) { // length of the random string.
			int index = (int) (rnd.nextFloat() * combination.length());
			salt.append(combination.charAt(index));
		}
		String randomString = salt.toString();
		System.out.println("Random string :" + randomString);

	}
}
