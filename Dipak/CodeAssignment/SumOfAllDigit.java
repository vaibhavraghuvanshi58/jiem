package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfAllDigit{
	public static void main(String args[]) throws NumberFormatException, IOException {
		// taking input from console
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, sum=0;
		System.out.print("Enter number you want to sum: ");
		num = Integer.parseInt(br.readLine()); 
		//int sum = 0; 
		//int num = 123;
		// actuall logic
        while (num != 0) 
        { 
            sum = sum + num % 10;
            num = num/10;
        } 
		System.out.printf("Sum = %d\n", sum);
	}
}
