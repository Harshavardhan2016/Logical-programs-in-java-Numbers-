/*
import java.util.*;
class Large_digit_primeornot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int x=0; //largedigit
		while (n!=0)
		{
			int ld = n%10;
			if (ld>x)
			{
				x = ld;
			}
			else if(x>ld)
			{
				x=x;
			}
			else
			{
			x=ld;
			}

			n=n/10;
		}
		int count=0;
		for (int i =1;i<=x ;i++ )
		{
			if (x%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
		if (count==2)
		{
			System.out.println(x+" is a Prime ");
		}
		else 
		{
		System.out.println(x+ " is Not a Prime ");
		}
	}
}
*/

import java.util.*;
class Large_digit_primeornot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int x=0; //largedigit
		while (n!=0)
		{
			int ld = n%10;
			if (ld>x)
			{
				x = ld;
			}

			n=n/10;
		}

		int count=0;
		for (int i =1;i<=x ;i++ )
		{
			if (x%i==0)
			{
				count++;
			}
		}
		System.out.println("count is: "+count);
		if (count==2)
		{
			System.out.println(x+" is  Prime ");
		}
		else 
		{
		System.out.println(x+ " is Not a Prime ");
		}
	}
}

