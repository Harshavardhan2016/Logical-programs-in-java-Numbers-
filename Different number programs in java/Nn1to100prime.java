import java.util.Scanner;
class Nn1to100prime
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("The Prime numbers between 1 to 100 are: ");
		
		for (int i=1;i<=100 ;i++ )
		{
			int count =0;
			for (int j =1;j<=i ;j++ )
			{
				if (i%j==0)
				{
					count++;
				}
			}
			if (count == 2)
			{
				System.out.println(i);
			}
		} 
	}
}

