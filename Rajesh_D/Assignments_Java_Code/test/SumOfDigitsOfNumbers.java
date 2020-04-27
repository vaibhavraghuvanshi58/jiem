package test;

import java.util.Scanner;

public class SumOfDigitsOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter any Number- ");  
		int n= sc.nextInt();
		int Rem=n;
		int total = 0;
		System.out.println("Numbers are as follows:");
		while (Rem != 0){
			Rem=n%10;
			n=n/10;
			total=total+Rem;
			System.out.println(Rem);
			
		};
		System.out.println("Total = "+total);
	}

}