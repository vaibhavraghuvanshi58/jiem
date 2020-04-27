package assignments_wap;
import java.util.Scanner;

public class StringFindWordsAndLetters {

	public static void main(String[] args) {
		String str1;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter string :");
		str1 = sc1.nextLine();
		int totalWords = 1, totalLetters = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ' ') {
				totalWords++;
			}
			if (str1.charAt(i) != ' ')
				totalLetters++;
		}
		System.out.println("total words : " + totalWords);
		System.out.println("total words : " + totalLetters);
	}
}
