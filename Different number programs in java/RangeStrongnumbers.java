class RangeStrongnumbers 
{
	public static void main(String[] args) 
	{
		for (int num = 1;num<=50000 ;num++ )
		{
			int temp = num;
			int sum =0;
			while (num!=0)
			{
				int ld = num%10;
				int fact =1;
				for (int i=1;i<=ld ;i++)
				{
					fact = fact*i;
				}
					sum = sum+fact;
					num = num/10;
			}
			if (temp == sum)
			{
				System.out.println(temp);
			}	
			num = temp;
		}
		
	}
}

