package Test;

public class PrimeNumbers {

	public static void main(String[] args) {

		int i;
		int m=0;
		int flag=0;    
		int n=8;//it is the number to be checked  


		m=n/2;                                             // What is the reason for this ?
		if(n==0||n==1){
			System.out.println(n+" is not prime number");    
		}else  {
			for(i=2;i<=m;i++){    
				if (n%i==0){    
					System.out.println(n+" is not prime number");    
					flag=1;    
					return;


				}    
			} 
			
			if(flag==0)  { System.out.println(n+" is prime number"); }
		}//end of else
	}  
}





