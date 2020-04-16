package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean isPrime=true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number to find out prime number or not : ");
		int number = Integer.parseInt(br.readLine());
		for (int i = 2; i <= number/2; i++) {			
			if (number % i == 0) {
				isPrime = false;
				break;
			}						
		}
		if(isPrime)
		{
			System.out.println(number +" is Prime number");
		}else {
			System.out.println(number +" is Not prime number");
		}
	}
}
