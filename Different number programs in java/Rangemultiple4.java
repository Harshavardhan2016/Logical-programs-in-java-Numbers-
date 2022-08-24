import java.util.Scanner;
class Rangemultiple4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter minimum range ");
		int min = s.nextInt();
		System.out.println("Enter maximum range ");
		int max = s.nextInt();

		System.out.println("The multiples of 4 in the given range are below:");
		for (int i=min; i<=max ; i++)
		{
			if (i%4==0)
			{
				System.out.println(i);
			}
		}

	}
}
