import java.util.Scanner;
class Spynumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		int or = num;
		int sum =0;
		int product=1;
		String str = "Spy";
		while (num!=0)
		{
			int last_digit = num%10;
			sum = sum+last_digit;
			product = product * last_digit;
			num = num/10;
		}
		if (product == sum)
		{
			System.out.println(or +" is a Spy number");
			//System.out.println(str);
		}
		else{
		System.out.println(or + " is Not a Spy number");
		}
	}
}

