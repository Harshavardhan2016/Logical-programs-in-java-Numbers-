/*
import java.util.Scanner;
class Armstrongrange 
{
	public static void main(String[] args) 
	{
		for (int num =1;num<=1000 ;num++ )
		{
			int t = num;
			int count =0;
			while (num!=0)
			{
				count++;
				num=num/10;
			}
			num =t;
			int sum =0;
			while (num!=0)
			{
				int ld = num%10;
				int exp =1;
				for (int j =1;j<=count ;j++ )
				{
					exp = exp*ld;
				}
				sum = sum+exp;
				num = num/10;
			}
			if (sum == t)
			{
				System.out.println(t);
			}
			num = t;
		}
	}
}
*/

import java.util.Scanner;
class Armstrongrange
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=1000 ;a++ )
		{
		

		int n = a;
		int t = n;
		int count =0;
		while (n!=0)
		{
			count++;
			n = n/10;
		}
		n = t;
		int sum =0;
		while (n!=0)z
		{
			int ld = n%10;
			int exp = 1;
			for (int i =1;i<=count ;i++ )
			{
				exp = exp*ld;
			}
			sum = sum+exp;
			n= n/10;
		}
		if (sum == t)
		{
			System.out.println(t+" is Amstrong number");
		}
		
	}
}

}
