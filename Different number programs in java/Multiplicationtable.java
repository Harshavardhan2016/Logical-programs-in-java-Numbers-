/*
import java.util.Scanner;
class Multiplicationtable 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number to get mutiplication table");

		int n = s.nextInt();


		System.out.println("Enter a number to get  range of mutiplication table");
		
		int t = s.nextInt();

		for (int i=1;i<=t ;i++ )
		{
			System.out.println(n +" x "+ i+ " = " + n*i);
		}
	}
}
*/

/*

import java.util.Scanner;
class Multiplicationtable 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number to get that mutiplication table");

		int n = s.nextInt();


		System.out.println("Enter a number to get  range of mutiplication table");
		
		int t = s.nextInt();
		int i =1;
		while (i<=t)
		{
			System.out.println(n +" x "+ i+ " = " + n*i);
			i++;
		}
	}
}

*/

import java.util.Scanner;
class Multiplicationtable 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number to get that mutiplication table");

		int n = s.nextInt();


		System.out.println("Enter a number to get  range of mutiplication table");
		
		int t = s.nextInt();
		int i =1;
		do
		{
			System.out.println(n +" x "+ i+ " = " + n*i);
			i++;
		}
		while (i<=t);
	}
}