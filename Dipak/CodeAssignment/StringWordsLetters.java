package test;

public class StringWordsLetters {

	public static void main(String[] args) {

		String name ="dipak o patil";

		int wordcount =0;
		int characters =0;
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)==' ' && name.charAt(i+1)!=' ')
			{
				wordcount++;
			}
			if(name.charAt(i)!=' ')
			{
				characters++;
			}
		}
		System.out.println("Characters in string "+characters);
		System.out.println("Words in string "+(wordcount+1));  // +1 for last word
		
	}

}
