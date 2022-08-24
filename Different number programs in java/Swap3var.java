import java.util.Scanner;
class Swap3var 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x value");
		int x = s.nextInt();
		System.out.println("Enter y value");
		int y = s.nextInt();
		int z=0;
		z=x;
		x=y;
		y=z;
		System.out.println("After swapping x value is "+x);
		System.out.println("After swapping y value is "+y);

	}
}
