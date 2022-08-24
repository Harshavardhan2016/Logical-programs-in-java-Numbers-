import java.util.Scanner;
class Nn1to100even
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		for (int i=1;i<=100 ;i++ )
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		} 
	}
}
