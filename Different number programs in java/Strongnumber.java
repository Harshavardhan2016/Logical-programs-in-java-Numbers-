import java.util.Scanner;
class Strongnumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum =0;
		int temp = num;
		while (num!=0)
		{
			int last_digit = num%10;
			int factorial =1;
			for (int i=1;i<=last_digit ;i++ )
			{
				factorial = factorial*i;

			}
			sum = sum+prod;
			num = num/10;

		}
		if (sum == temp)
		{
			System.out.println("Strong number");  ///145, 40585
		}
		else {
		System.out.println("Not a Strong number");
		}
	}
}

