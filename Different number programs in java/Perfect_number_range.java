/// perfect numbers in the range
import java.util.Scanner;
class Perfect_number_range 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to get perfect numbers till that number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("The perfct numbers till "+ n+" are");
		for (int i =1;i<=n ;i++ )
		{
			int count = 0;
			for (int j=1;j<i ;j++ )
			{
				if (i%j==0)
				{
					count = count+j;
				}
			}
			if (count == i)
			{
						System.out.println(i);

			}
		}

	}
}

