class Strongnumber4 
{
	public static void main(String[] args) 
	{
		int x=1;
		int strong=1;
		while (strong<=4)
		{
			int sum=0;
			int temp =x;
			while (x!=0)
			{
				int ld = x%10;
				int fact =1;
				for (int a =1;a<=ld ;a++ )
				{
					fact = fact*a;
				}
				sum = sum+fact;
				x=x/10;
			}
			x = temp;
			if (sum==x)
			{
				System.out.println(x);
				strong++;
			}
			x++;
			
		}
		
	}
}
