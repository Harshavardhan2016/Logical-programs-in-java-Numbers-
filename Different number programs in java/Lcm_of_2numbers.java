/*
// with hcf ------------------------------------------------------------------------------------
import java.util.*;
class Lcm_of_2numbers 
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
		int lcm = a*b/gcd;

		System.out.printf("The LCM of %d and %d is %d.", a, b, lcm); 
	}
}
*/


/*
// without hcf--------------------------------------------------------------------------------------
import java.util.*;
class Lcm_of_2numbers 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = s.nextInt();
		System.out.println("Enter 2nd number");
		int b = s.nextInt();
		int lcm = 0;
		for (int i =a;i<=a*b; i++)
		{
			if (i%a==0 && i%b==0)
			{
				lcm = i;
				break;
			}
		}
		

		System.out.println("The LCM of "+a+" and "+b+" is "+lcm);
	}
}
*/


// without hcf 4 numbers --------------------------------------------------------------------------------
import java.util.*;
class Lcm_of_2numbers 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = s.nextInt();
		System.out.println("Enter 2nd number");
		int b = s.nextInt();
		System.out.println("Enter 3rd number");
		int c = s.nextInt();
		System.out.println("Enter 4th number");
		int d = s.nextInt();
		int lcm = 0;
		for (int i =a;i<=a*b*c*d; i++)
		{
			if (i%a==0 && i%b==0 && i%c==0 && i%d==0)
			{
				lcm = i;
				break;
			}
		}
		

		System.out.println("The LCM of "+a+" and "+b+" and "+c+" and "+d+" is "+lcm);
	}
}
