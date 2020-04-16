package test;

public class MinMaxValueFind {

	public static void main(String args[]) {
		int num[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int max = getMax(num);
		System.out.println("Maximum Value is: " + max);

		int min = getMin(num);
		System.out.println("Minimum Value is: " + min);
	}
	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}
}