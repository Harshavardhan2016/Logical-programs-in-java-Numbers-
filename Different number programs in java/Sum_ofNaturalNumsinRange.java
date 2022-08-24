import java.util.Scanner;
class Sum_ofNaturalNumsinRange 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Minimum number");
		int n1 = s.nextInt();
		System.out.println("Enter Maximum range");
		int n2 = s.nextInt();
		int sum =0;
		for (int i = n1; i <=n2 ;i++ )
		{
			sum =sum+i;
		}
		System.out.println("Sum of natural numbers in given range is: "+sum);
	}
}

