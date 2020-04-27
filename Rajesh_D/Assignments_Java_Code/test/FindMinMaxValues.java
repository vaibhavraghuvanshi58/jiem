package test;

import java.util.Scanner;

public class FindMinMaxValues 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("How many Numbers are there?");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		System.out.println("Enter "+size+" Numbers:");
		int a[]=new int [size];

		//Scanner sc1= new Scanner(System.in);

		for(int i=0; i<size; i++)
		{

			a[i] = sc.nextInt();
		}
		int max=0;
		for (int i=0;i<size;i++)
		{
			if (a[i]>max)
					{
					max=a[i];
					}
		}
		System.out.println("Maximum Number is: "+ max);

		int min=a[0];
		for (int i=0;i<size;i++)
		{
			if (a[i]<min)
					{
					min=a[i];
					}
		}
		System.out.println("Minimum Number is: "+ min);
	}

}