package test;

import java.util.Scanner;

public class PrimeNumbers
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a Number- ");  // series length

		Scanner sc = new Scanner(System.in);  // series length
		int n = sc.nextInt();

		int PrimeFlag=0; //If it remains 0 then Number is Prime number
		int by2=n/2;

		for (int i=2; i<by2; i++)
		{
			if(n%i==0)
			{
				PrimeFlag++;
			}
		}
		if (PrimeFlag==0)
		{
			System.out.println("Number "+n+" is a Prime Number");
		}else
		{
			System.out.println("Number "+n+" is not a Prime Number");
		}

	}
}

