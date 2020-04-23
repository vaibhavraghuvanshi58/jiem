package test;
import java.util.Scanner;

public class SortingArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("How many Numbers are there?"); //Array size
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		System.out.println("Enter "+size+" Numbers:");
		int a[]=new int [size];

		//Scanner sc1= new Scanner(System.in);

		for(int i=0; i<size; i++) //Get the Numbers in Array
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter 0 for Ascending order. & Enter 1 for Descending order"); //Order of Sorting
		int order = sc.nextInt();

		if (order!=0 && order!=1)
		{
			System.out.println("Invalid Entry... Default sorting is Ascending");
			order=0;
		}
		if (order==0)
		{ System.out.println("Ascending Order is as follows:");
		for (int j=0; j<size;j++)
		{
			for (int i=0;i<j;i++)  
			{

				if (a[i]>a[j])         // Sort Ascending
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}//if
			} //for i	
		}//j
		}
		if (order==1)
		{ System.out.println("Descending Order is as follows:");
			for (int j=0; j<size;j++)
			{
				for (int i=0;i<j;i++)  
				{

					if (a[i]<a[j])         // Sort Descending
					{
						a[i]=a[i]+a[j];
						a[j]=a[i]-a[j];
						a[i]=a[i]-a[j];
					}//if
				} //for i	
			}//j

		}

		for (int i=0;i<size;i++)  
		{
			System.out.println(a[i]);

		}

	}

}