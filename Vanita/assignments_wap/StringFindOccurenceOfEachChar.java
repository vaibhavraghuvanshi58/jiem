package assignments_wap;

import java.util.Scanner;

public class StringFindOccurenceOfEachChar {

	public static void main(String[] args) {
		String str1;
		int count = 1;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter string :");
		str1 = sc1.nextLine();

		for (char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < str1.length() - 1; j++) {
				if (str1.charAt(j) == i) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(i + "=" + count);
				count = 0;
			}
		}

	}

}
