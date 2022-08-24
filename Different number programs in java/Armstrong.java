import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = s.nextInt();
		int t = n;
		int count =0;
		while (n!=0)
		{
			count++;
			n = n/10;
		}
		n = t;
		int sum =0;
		while (n!=0)
		{
			int ld = n%10;
			int exp = 1;
			for (int i =1;i<=count ;i++ )
			{
				exp = exp*ld;
			}
			sum = sum+exp;
			n= n/10;
		}
		if (sum == t)
		{
			System.out.println("Amstrong number");
		}
		else{
		System.out.println("Not a Amstrong number");
		}

	}
}


