package Test;

public class PrintingStar {

	public static void main(String[] args) {

		int [][]a = new int[10][10];    
		for(int i = 0; i < 10; i++) // i set to 0
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.printf( "%2d ",a[i][j]); //
			}
			System.out.println();
		}	
	}

}


