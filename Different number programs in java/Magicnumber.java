import java.util.*;
class Magicnumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a nummber");
		int n = s.nextInt();
		
		
		while (n>9)
		{
			int sum =0;
			int ld =0;
			while (n!=0)
			{
				ld = n%10;
				n= n/10;
				sum = sum+ld;
			}
			
			n= sum;
		}
		if (n==1)
		{
			System.out.println("Magic number");
		}
		else
		{
			System.out.println("Not a Magic number");
		}

	}
}
