/*Reverse a String using reversal logic*/
package Session11Task;

public class StringReverse {

	public static void main(String[] args) {

		String name="This is my program";
		char str[]=name.toCharArray();

		int temp=str.length;
		for(int i=temp-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}
}