package test;

public class RandomString {

	static String getAlphaNumericString(int n) {

		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {
			int index = (int) (str.length() * Math.random());
			sb.append(str.charAt(index));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(RandomString.getAlphaNumericString(n));
	}
}
