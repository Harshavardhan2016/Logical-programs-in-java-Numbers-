import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int or = num;
		int reverse = 0;
		int last_digit = 0;
		while (num!=0)
		{
			last_digit = num%10;
			reverse = reverse*10+last_digit;
			num = num/10;
		}
		//int rev = reverse;

		if (or == reverse)
		{
			System.out.println(or+" is Palindrome");
		}
		else{
			System.out.println(or+ " is Not a Palindrome");
		}
	}
}






