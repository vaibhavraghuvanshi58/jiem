package assignments;

public class stringReverse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str1="Rajesh N Desai";
		int len=str1.length();
		char[] str2= new char[len];
		str2=str1.toCharArray();
		for (int i=len-1; i>=0; i--)
		{
			System.out.print(str2[i]);
		}
		
			}

}
