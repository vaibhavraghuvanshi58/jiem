package test;

public class StringAssignment {
	public static void main(String[] args) {
//		Reverse a String using reversal logic
		System.out.println(reverse("nilesh"));
		
//		Find how many words and letters in a string.
		findWordsLetters("My name is nilesh");
		
//		Find how many specific chars in string and occurrences of each char
//		Modify a sentence in such a way that first letter of every word should be capital
//		Create a random String of 5 chars (use google to solve this)
//		Create Date as String  (use google to solve this)
//		Difference  between StringBuffer and StringBuilder

	}
	
	static StringBuilder reverse(String input){
		int i;
		StringBuilder result = new StringBuilder(input);
		result = result.reverse();
		return result;
	}

	static void findWordsLetters(String input){
		int i;
		int wordCount = 0;
		int letterCount = 0;
		if(input.length() > 0) {
			wordCount++;
		}
		
		for(i = 0;i<=input.length()-1;i++){
			
			if(input.charAt(i) == ' '){
				wordCount++;
			} else {
				letterCount++;
			}
		}
		System.out.println("Word count : " + wordCount);
		System.out.println("Letter count : " + letterCount);
		
	}
}
