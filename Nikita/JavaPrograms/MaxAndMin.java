package program;

public class MaxAndMin {

	public int max(int[] array)
	{
		int max=0;

		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		return max;
	}


	public int min(int[] array)
	{
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[0]<min)
			{
				min=array[i];
			}
		}
		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray={10,20,30,40,50};
		MaxAndMin m=new MaxAndMin();
		System.out.println("Maximum value in the array is: "+m.max(myArray));
		System.out.println("Minimum value in the array is: "+m.min(myArray));

	}

}
