package test1;

public class A 
{
	public static void main(String[] args) 
	{
		
	int X = 10;
	int m =  X++  + ++X + ++X + X++ + X++;
	   //  10   + 11 + 12
       //x = 11 , 12 , 13
	System.out.println(m);
	System.out.println(X);
	}
	
}
/*
 * If constructor is private, then how can i call non-static methods of that
 * class
 * 
 * hint - you can create static method
 */

/*class Task 
{
	
	Task(int i)
	{
		System.out.println("Con");
	}
	public void Task()
	{
		System.out.println("Method");
	}
}*/
