class EvenorOdd 
{
	public static void main(String[] args) 
	{
		int a = 23;
		String b =((a%2)==0)?"Even":"Odd";
		System.out.println(b);

		// criteria check.

		int age = 20;
		int age2 = 5;
		System.out.println((age >=18)?"eligible":"Betterlucknexttime");
		System.out.println((age2 >=18)?"eligible":"Betterlucknexttime");

		// IAS Officer eligibility

		int ia = 26;
		String ib = ((ia>=21) && (ia <=32))?"E":"NE";
		System.out.println(ib);

		//Marriage Eligibility upon age.

		int boy= 25;
		int girl = 17;

		String cond = ((boy >=23)&&(girl>=21))?"Possible":"Impossible";
		System.out.println(cond);
	}
}
