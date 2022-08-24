class Armstrong25 
{
	public static void main(String[] args) 
	{
		int x=1;
		int arm =1;
		while (arm<=25)
		{
			int count =0;
			int temp =x;
			while (x!=0)
			{
				count++;
				x= x/10;
			}
			x = temp;
			int sum=0;

			while (x!=0)
			{
				int ld = x%10;
				int exp =1;
				for (int i =1;i<=count ;i++ )
				{
					exp = exp*ld;
				}
				sum = sum+exp;
				x= x/10;
			}
			x = temp;
			 if (sum == x)
			 {
				 System.out.println(arm + " : "+x);
				 arm++;
			 }
				 x++;
		}
		
	}
}
