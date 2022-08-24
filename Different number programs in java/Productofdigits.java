import java.util.Scanner;
class Productofdigits 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int product =1;
		int num = s.nextInt();
		while (num!=0)
		{
			int lastdigit = num %10;
			product = lastdigit*product;
			num = num/10;
		}
		System.out.println(product);
	}
}

