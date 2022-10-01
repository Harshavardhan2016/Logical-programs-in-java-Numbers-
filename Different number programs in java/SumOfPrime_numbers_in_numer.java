// sum of prime digits
import java.util.Scanner;
class SumOfPrime_numbers_in_numer 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		while (n!=0)
		{
			int ld = n%10;
			int count =0;
			for (int i=1;i<=ld ;i++ )
			{
				if (ld %i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				sum = sum+ld;
			}
			n= n/10;
		}
		System.out.println(sum);

	}
}