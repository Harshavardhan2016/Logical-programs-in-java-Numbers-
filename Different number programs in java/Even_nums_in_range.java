import java.util.Scanner;
class Even_nums_in_range 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1st natural number or minimum range");
		
		int n1 = s.nextInt();

		System.out.println("Enter 2nd natural number greater than 1st number or maximum range");

		int n2 = s.nextInt();

		if (n1<n2)
		{
			System.out.println("The even natural numbers are ");
			for (int i=n1;i<=n2 ;i++ )
			{
				if (i%2==0)
				{

					System.out.println(i);
				}
			} 
		}
		else {
			System.out.println("No output since " +n1+ " is greater than "+n2);
		}
	}
}


