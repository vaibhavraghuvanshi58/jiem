package test;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int n = 456;
		int sum = 0; 
		
		sum = n%10 + (n/10)%10 + (n/100);
		
	System.out.println("sum of digits of number:" +sum);

	}

}
