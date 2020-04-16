package program;

public class sum123 {

	public static void main(String[] args) {

		int n=123, sum=0;
		System.out.println("Interger value is:"+n);
		while (n != 0) {

			// add last digit to the sum
			sum =sum + n % 10;
			System.out.println("add last digit to the sum: "+sum);
			
			// cut last digit
			n = n/10;
			System.out.println("cut last digit: "+n);
			
		}
		
		System.out.println("Sum of digits: " + sum);

	}
}


// algorithm step by step

// base:  sum = 0, n = 123

// step1: n % 10 = 3, n / 10 = 12

//        sum = 3, n = 12

// step2: n % 10 = 2, n / 10 = 1

//        sum = 5, n = 1

// step3: n % 10 = 1, n / 10 = 0

//        sum = 6, n = 0

// stop:  (n != 0) is false