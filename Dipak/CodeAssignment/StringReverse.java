package test;

public class StringReverse {

	public static void main(String[] args) {
		
		String name = "dipak patil";
		
		char str[] = name.toCharArray();

		int temp = str.length-1; 
		
		for(int i=temp; i>=0; i--)
		{
			System.out.println(str[i]);
		}
}
}