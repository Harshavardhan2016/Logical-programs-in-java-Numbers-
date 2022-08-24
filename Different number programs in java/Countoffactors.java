import java.util.Scanner;
class Countoffactors 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to get it's count of factors: ");
		int n = s.nextInt();
		int sum = 0;
		for (int i=1;i<=n ;i++ )
		{
			if (n% i ==0)
			{
				sum += 1; //sum++;
			}
		}
		System.out.println("Number of factors of number "+n+" are "+sum);
	}
}

