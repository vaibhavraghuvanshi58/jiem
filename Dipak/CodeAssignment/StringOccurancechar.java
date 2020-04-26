package test;

public class StringOccurancechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "dipak o patil";		
		int characters = 0;
		int len = name.length();
		char str[] = name.toCharArray();
		for (int i = 0; i < len; i++) {
			if (name.charAt(i) == str[i]) {
				characters++;
			}
			
		}
		System.out.println("Characters in string " + characters);

	}

}
