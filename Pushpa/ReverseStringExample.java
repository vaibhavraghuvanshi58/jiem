//Reverse a String using reversal logic

public class ReverseStringExample
{  
	public static void main(String args[])
	{  
	String1 A1= "Good Morning";
	
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
	
	for(int i=0;i<len;i++)
	{
		
		RS[i]= S1.charat((len-1));
		len=--len;
	}
	
	 
retrun RS; 
}
