import java.util.*;
class Coprime 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int x = s.nextInt();
		System.out.println("Enter 2nd number");
		int y = s.nextInt();
		int hcf =1;
		for (int i = 1;i<=x ;i++ )
		{
			if (x%i==0 && y%i==0)
			{
				hcf=i;
			}
		}
		if (hcf==1)
		{
			System.out.println(x+" and "+y+" are Co-Prime");
		}
		else
		{
			System.out.println(x+" and "+y+" are Not a Co-prime");
		}


	}
}
