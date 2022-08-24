class Spynumber3 
{
	public static void main(String[] args) 
	{
		int x=1;
		int spy=1;
		while (spy<=100)
		{
			int temp = x;
			int sum=0;
			int prod=1;
			while (x!=0)
			{
				int ld = x%10;
				sum = sum+ld;
				prod = prod *ld;
				x= x/10;
			}
			x = temp;
			if (sum == prod)
			{
				System.out.println(x);
				spy++;
			}
			x++;
		}
	}
}
