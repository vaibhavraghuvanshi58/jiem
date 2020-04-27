package assignments_wap;
import java.util.Scanner;

public class StringReverse {
	public static void main(String args[]) {
		String str1, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter  string :");
		str1 = in.nextLine();
		int length = str1.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + str1.charAt(i);
		System.out.println("Reverse string: " + reverse);
	}
}
