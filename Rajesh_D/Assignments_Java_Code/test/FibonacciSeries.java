package test;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int next=0;
		int fibo[]=new int [10];
		fibo[0]=n1;
		fibo[1]=n2;
		for (int i=2; i<10; i++)
		{
			fibo[i]=fibo[i-1]+fibo[i-2];
		
		}
		System.out.println("Fibonacci Series generated is:");
		for (int i=0; i<10; i++)
		{
			System.out.println(fibo[i]);
			
		}
	}
}