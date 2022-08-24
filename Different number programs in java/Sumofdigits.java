/*
import java.util.Scanner;
class Sumofdigits
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = s.nextInt();
		int sum =0;
		int last_digit=0;
		while (num!=0)
		{
			last_digit = num%10;
			sum = sum+last_digit;
			num= num/10;
		}

		System.out.println(sum);
	}
}

*/

import java.util.Scanner;
class Sumofdigits
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		//int num = s.nextInt();
		int sum =0;
		for (int num = s.nextInt();num!=0 ;num = num/10 )
		{
			int last_digit = num%10;
			sum = sum+last_digit;

		}

		System.out.println(sum);
	}
}



