package program;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0, n2=1,n3,count=10;     

		System.out.print(n1+" "+n2);

		for(int i=2;i<count;i++)//loop starts from 2 b�xoz 0 & 1 are already printed    
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		}

	}


}


