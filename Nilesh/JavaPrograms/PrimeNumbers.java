package test;					
public class PrimeNumbers {
	public static void main(String[] args){
		int number = 18;				
		int i;				
		boolean isPrime = true;
		for(i=2;i<number;i++){				
			if(number % i == 0){			
				isPrime = false;		
				break;		
			}			
		}				
						
		if(isPrime == false){				
			System.out.println(number + " is not Prime");			
		} else {				
			System.out.println(number + " is prime");			
		}
	}
}					
