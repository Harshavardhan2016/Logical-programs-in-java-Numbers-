import java.util.Scanner;
class Sumof_Factorialof_digits 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int sum =0;
		while (num!=0)
		{
			int last_digit = num%10;
			int prod =1;
			for (int i =1;i<=last_digit ;i++ )
			{
				prod = prod*i;
			}
			sum = sum+prod;
			num = num/10;
		}
		System.out.println("The sum of factorial of digits is "+sum);
	}
}


// if sum...
/*
import java.util.Scanner;
class Sumof_Factorialof_digits 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int sum =0;
		while (num!=0)
		{
			int last_digit = num%10;
			int ds =0;
			for (int i= 1 ;i<=last_digit ;i++ )
			{
				if (last_digit%i ==0)
				{
					ds = ds+i;
				}
			}
			sum= sum+ds;
			num = num/10;
		}
		System.out.println(sum);
	}
}

*/

// if count...

/*
import java.util.Scanner;
class Sumof_Factorialof_digits 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int sum =0;
		while (num!=0)
		{
			int last_digit = num%10;
			int ds =0;
			for (int i= 1 ;i<=last_digit ;i++ )
			{
				if (last_digit%i ==0)
				{
					ds = ds+1;
				}
			}
			sum= sum+ds;
			num = num/10;
		}
		System.out.println(sum);
	}
}
*/