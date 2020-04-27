package assignments_wap;

import java.util.Scanner;

public class StringFirstLetterCapital {
	public static void main(String args[]) {
		String str1, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter  string :");
		str1 = in.nextLine();
		StringBuilder result = new StringBuilder(str1.length());
		String words[] = str1.split("\\ ");
		for (int i = 0; i < words.length; i++) {
			result.append(Character.toUpperCase(words[i].charAt(0)))
					.append(words[i].substring(1)).append(" ");
		}
		System.out.println("String with first capital letter : " + result);
	}
}
