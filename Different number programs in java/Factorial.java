/*
import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number to get Factorial: ");
		int n = s.nextInt();
		
		int mul = n;
		for (int i =n-1;i>=1 ;i-- )
		{
			mul = mul*i;
		}
		System.out.println("The Factorial of "+n +" is: "+mul);
		
	}
}

*/

import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number to get Factorial: ");
		int n = s.nextInt();
		
		int mul = 1;
		for (int i =1;i<=5 ;i++ )
		{
			mul = mul*i;
		}
		System.out.println("The Factorial of "+n +" is: "+mul);
		
	}
}

