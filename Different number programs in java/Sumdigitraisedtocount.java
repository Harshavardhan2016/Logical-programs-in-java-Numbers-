import java.util.Scanner;
class Sumdigitraisedtocount 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int count =0;
		int temp = n;
		while (n!=0)
		{
			count = count+1;
			n = n/10;

		}

		int sum =0;
		while (temp !=0)
		{

			int exp=1;
			int ld = temp%10;
			for (int i=1;i<=count ;i++ )
			{
				exp = exp*ld;

			}
			sum = sum+exp;
			temp = temp/10;
		}
		System.out.println(sum);
	}
}
