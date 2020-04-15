package test;					
public class MaxMinValueSearch {					
	public static void main(String[] args){				
		int[] numbers = {5,7,2,9,8,4};			
		System.out.println("Minumum value in array is " + min(numbers));			
		System.out.println("Maximum value in array is " + max(numbers));			
	}				
					
	static int min(int[] numbers){ 				
		int min = numbers[0];			
		int i;			
		for(i = 1;i < numbers.length; i++){			
			if(min > numbers[i] )		
				min = numbers[i];	
		}			
		return min;			
    } 					
					
	static int max(int[] numbers){ 				
		int max = numbers[0];			
		int i;			
		for(i = 1;i < numbers.length; i++){			
			if(max < numbers[i] )		
				max = numbers[i];	
		}			
		return max;			
    }					
}					
