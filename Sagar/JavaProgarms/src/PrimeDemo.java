
public class PrimeDemo {

	public static void main(String[] args) {
		
		int a = 17;
		
		for(int i=2;i<= a ;i++)
		{
			if( (a != i) && (a % i == 0))
			{
				System.out.println("no is not prime no");
				break;
			}
			else
			{
				if(a == i)
				{
					System.out.println("no is prime no");
				}
			}
		}

	}

}
