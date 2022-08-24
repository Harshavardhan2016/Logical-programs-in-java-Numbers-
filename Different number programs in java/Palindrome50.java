class Palindrome50 
{
	public static void main(String[] args) 
	{
		int x = 1;
		int pal = 1;
		while (pal <=50)
		{
			int temp =x;
			int rev =0;
			while (x!=0)
			{
				int ld = x%10;
				rev = rev*10 +ld;
				x= x/10;
			}
			x = temp;
			if (rev == x)
			{
				System.out.println(x);
				pal++;
			}
			x++;
		}
	}
}
