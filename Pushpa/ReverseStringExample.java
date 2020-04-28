//Reverse a String using reversal logic


public class ReverseStringExample
{  
	public static void main(String args[])
	{  
	String A1= "Good Morning";
	
	StringMethods SM1= new StringMethods();
	
	String R1= SM1.ReverseString(A1);
	
	System.out.println(R1); 
	}
}  

class StringMethods
{
public static String ReverseString(String S1)
{

	int len=S1.length();
	
	char RS[] = new char[len];
			
	for(int i=len-1;i>=0;i--)
	{
		
		RS[(len-i)-1]= S1.charAt((i));
		
	}
	
	 
return new String(RS); 
}
}
