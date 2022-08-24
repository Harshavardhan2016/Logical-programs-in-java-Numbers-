//prime number has two factors 1 and itself.

// 2 or more factors composite number.

/*
import java.util.Scanner;
class Primenumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check it is prime or not:");
		int num = s.nextInt();
		int count =0;
		for (int n=2; n<= num ; n++ )
		{
			if (num % n==0)
			{
				count++;
			}
		}
		if (count == 1)
		{
			System.out.println(num+" is a prime number");
		}
		else{
		System.out.println(num + " is Not a prime number");
		}

	}
}
*/

import java.util.Scanner;
class Primenumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check it is prime or not:");
		int num = s.nextInt();
		int count =0;
		for (int n=1; n<= num ; n++ )
		{
			if (num % n==0)
			{
				count++;
			}
		}
		if (count == 2)
		{
			System.out.println(num+" is a prime number");
		}
		else{
		System.out.println(num + " is Not a prime number");
		}

	}
}

