import java.util.Scanner;
class Swapwithoutnewvar 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x value");
		int x = s.nextInt();
		System.out.println("Enter y value");
		int y = s.nextInt();
		x = x+y;
		y = x-y;
		x = x-y;

		/*
		
		x= x*y;
		y = x/y;
		x= x/y;

		*/
		System.out.println("After swapping x value is "+x);
		System.out.println("After swapping y value is "+y);

	}
}
