/*
import java.util.Scanner;
class Base_exponential
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter base value");
		int base = s.nextInt();
		int val = base; 
		System.out.println("Enter power value");
		int power = s.nextInt();
		for (int i= 1;i <power  ;i++ )
		{
			val = val*base;
		}
		System.out.println(val);
	}
}

*/

import java.util.Scanner;
class Base_exponential
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter base value");
		int base = s.nextInt();
		int exp = 1; 
		System.out.println("Enter power value");
		int power = s.nextInt();
		for (int i= 1;i <=power  ;i++ )
		{
			exp = exp*base;
		}
		System.out.println(exp);
	}
}

