import java.util.*;
class Hcf_of_2numbers 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = s.nextInt();
		System.out.println("Enter 2nd number");
		int b = s.nextInt();
		int gcd = 1;
		for (int i =1;i<=a && i<=b; i++)
		{
			if (a%i==0 && b%i==0)
			{
				gcd = i;
			}
		}
		System.out.printf("The GCD of %d and %d is %d.", a, b, gcd); 
	}
}


/*
import java.util.*;
class Hcf_of_2numbers 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = s.nextInt();
		System.out.println("Enter 2nd number");
		int b = s.nextInt();
		int gcd = 1;
		for (int i =1;i<=a; i++)
		{
			if (a%i==0 && b%i==0)
			{
				gcd = i;
			}
		}
		System.out.printf("The GCD of %d and %d is %d.", a, b, gcd); 
	}
}


*/