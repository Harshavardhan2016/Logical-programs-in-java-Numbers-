import java.util.*;
class Happynumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		
		while (n>9)
		{
			int sum =0;
			int prod =0;
			while (n!=0)
			{
				int ld = n%10;
				sum = ld*ld;
				n = n/10;
				prod = prod+sum;  // without prod --> sum = sum+(ld*ld)

			}
			
			n =prod;

		}
		if (n==1)
		{
			System.out.println("Happy number");
		}
		else
		{
			System.out.println("Not a Happy number");
		}
	}
}



