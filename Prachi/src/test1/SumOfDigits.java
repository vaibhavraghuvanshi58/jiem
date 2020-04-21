package test1;

public class SumOfDigits 
{

	    static int getSumofDigit(int n) 
	    { 
	    	int sum = 0; 
	          
	        while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	        } 
	      
	        return sum; 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        int n = 456; 
	  
	        System.out.println(getSumofDigit(n)); 
	    } 
} 