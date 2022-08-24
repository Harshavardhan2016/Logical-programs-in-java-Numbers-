class Primeorcomposite 
{
	public static void main(String[] args) 
	{
		int prime_count = 0;
		int comp_count = 0;
		int npc =0;
		for (int i=1;i<=100;i++ )
		{
			int count=0;
			for (int j=1;j<=i ;j++ )
			{		
				if (i%j==0)
				{
					count++;
				}
			}
			if (count ==2)
			{
				System.out.println(i + "   : Prime Number");
				prime_count++;
			}
			else if (count==1)
			{
				System.out.println(i + "   : Neither Prime Or Composite Number");
				
			}
			else 
			{
			 	System.out.println(i + "   : Composite Number");
				comp_count++;
			}
		}
		System.out.println();
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println();
		System.out.println();
		System.out.println("Count of prime numbers from 1 to 100: "+prime_count);
				System.out.println();
		System.out.println("Count of composite numbers from 1 to 100: "+comp_count);
				System.out.println();
		System.out.println("\"1\" is always Neither prime nor composite" );

				System.out.println();
	}
}

