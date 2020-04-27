/*Find how many words and letters in a string*/
package Session11Task;

public class StringWordsLetters {
	public static void main(String[] args) {

		String str="this is java program";
		String[] splitword=str.split(" ");

		System.out.println("Find words count: "+splitword.length);
		System.out.println("Find letters count: "+str.toString().length());
		
	}



}
