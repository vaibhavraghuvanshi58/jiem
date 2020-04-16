package program;

public class SwapWithThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1, y=2, temp;

		System.out.println("-----Before Swapping-----");
		System.out.println("x = "+x);
		System.out.println("y = "+y);

		temp=x;
		x=y;
		y=temp;

		System.out.println("-----After Swapping-----");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}


