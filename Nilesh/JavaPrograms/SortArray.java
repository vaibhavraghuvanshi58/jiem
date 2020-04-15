package test;
public class SortArray {
	public static void main(String[] args){
		int[] numbers = {5,7,2,9,8,4};
		int i,j,temp;
		
		for(i = 0;i<numbers.length;i++){
			for(j=i+1;j<numbers.length;j++){
				if(numbers[i] > numbers[j]){
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted array is - ");
		for(i = 0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
	}
}
