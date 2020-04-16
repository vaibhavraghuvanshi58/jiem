package test;

public class SwapNumber{  
    public static void main(String args[]){
	 int x=10, y=11;
	 System.out.println("\nSwapping with third variable");
     System.out.println("Before swapping values x = "+x+" y = "+y);
	 int temp;
	 temp=x;
	 x=y;
	 y=temp;
	 System.out.println("After swapping values x = "+x+" y = "+y+"\n");
	 System.out.println("Swapping without third variable");
	 int m=100, n=200;
	 System.out.println("Before swapping values m = "+m+" n = "+n);
	 m = m+n; 
	 n = m-n;
	 m = m-n;
	 System.out.println("After swapping values m = "+m+" n = "+n+"\n");
    }  
}
