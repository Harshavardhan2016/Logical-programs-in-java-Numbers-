class Perfectnumbers4 
{
	public static void main(String[] args) 
	{
		
		int x =1;
		int perf =1;
		
		while (perf<=4)
		{
			int sum =0;
		for (int i =1;i<x ;i++ )
		{
			if (x%i==0)
			{
				sum = sum+i;
			}
		}
		if (sum == x)
		{
			System.out.println(x);
			perf++;

		}
		x++;
		
	}
	}
}
