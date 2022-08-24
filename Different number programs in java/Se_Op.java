import java.util.Scanner;
class Se_Op 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int sum =0;
		int product =1;
		while (num!=0)
		{
			int ld = num%10;
			if (ld%2==0)
			{
				sum = sum+ld;
			}
			else{
			product = product*ld;
			}
			num = num/10;
		}
		System.out.println("The sum of even digits is: "+ sum);
		System.out.println("The product of odd digits is: "+product);
	}
}
