package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num1 = 0, num2 = 1, num3, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Limit to print Fibonacci Series : ");
		int number = Integer.parseInt(br.readLine());
		System.out.print(num1 + " " + num2);
		for (i = 2; i < number; ++i) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
