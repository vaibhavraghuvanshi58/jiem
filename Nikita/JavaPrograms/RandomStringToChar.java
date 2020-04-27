/*Create a random String of 5 chars*/
package Session11Task;

import java.util.Random;

public class RandomStringToChar {

	public static void main(String[] args) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder(5);
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String randomChar = sb.toString();
		System.out.println(randomChar);
	}
}
