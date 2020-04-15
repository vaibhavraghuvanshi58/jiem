package Test;

public class MaxMinValueInArray {

	public static void main(String[] args) {
		int[] bunch =  {120,7,56,252,345,1,0,-1,94,156,87,8};   //	System.out.println(bunch.length);

		int max = findMax (bunch);
		System.out.println("Highest number in the given array is :" + max);

		int min = findMin (bunch);
		System.out.println("Lowest number in the given array is :" +min);

	}

	public static int findMax(int[] inputtedbunch){ 
		int maxValue = inputtedbunch[0]; 
		for(int i=1;i < inputtedbunch.length;i++){ 
			if(inputtedbunch[i] > maxValue){ 
				maxValue = inputtedbunch[i];
			}
		}
		return maxValue;

	}

	public static int findMin(int[] inputtedbunch){ 
		int minValue = inputtedbunch[0]; 
		for(int i=1;i < inputtedbunch.length;i++){ 
			if(inputtedbunch[i] < minValue){ 
				minValue = inputtedbunch[i];
			}
		}
		return minValue;
	}

}
