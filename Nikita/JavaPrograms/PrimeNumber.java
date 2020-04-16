package program;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=11,flag=0;
		if(num == 0 || num == 1)
		{
			System.out.println(num+" No. is not Prime");
		}
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" No. is not Prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num+" No. is Prime");
			}
		}
	}
}

