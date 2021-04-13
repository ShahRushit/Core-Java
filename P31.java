import java.util.*;
class P31
{
	public static void main(String arg[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 Numbers : ");
		int val1,val2;
		val1 = s.nextInt();
		val2 = s.nextInt();
		int ans;
		try
		{
			ans = val1 / val2;
			System.out.println("Ans of " + val1 + "/" + val2 + " = " + ans);

		}
		catch(ArithmeticException e)
		{
			System.out.println(" Divide By Zero Exception....\n Please enter Above 0");
		}
	}
}