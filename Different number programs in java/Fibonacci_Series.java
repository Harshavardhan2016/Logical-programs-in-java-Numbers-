import java.util.Scanner;
class Fibonacci_Series 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to get that many fibonacci values");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for (int i=1;i <=n ;i++ )
		{
		System.out.println(c);
		a=b;
		b=c;
		c=a+b;
		}

	}
}
