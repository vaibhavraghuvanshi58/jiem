package test;

public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1;
		int n2=2;
		System.out.println("Original values");
		System.out.println("n1= "+n1+" & n2= "+n2);
		
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	System.out.println("After Swapping");
	System.out.println("n1= "+n1+" & n2= "+n2);
	}
}