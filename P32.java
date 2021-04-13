/*
	Write a program in Java to demonstrate throw, throws, finally, multiple try block 
	and multiple catch exception.
*/
import java.util.*;
class P32
{
	public static void main(String args[])
	{
		int no = 0;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter Number: ");
			no = sc.nextInt();
			P32 p = new P32();
			try
			{
				p.method(no);
			}
			catch(ArithmeticException a)
			{
				System.out.println("try again leter");
				System.out.println(a);
			}
		}
		catch(NumberFormatException n)
		{
			System.out.println(n.getMessage());
			System.out.println("exception");
		}
	}
	void method(int num) throws ArithmeticException
	{
		if(num == 0)
		{
			throw new ArithmeticException("Number cannot be 0");
		}
		else if(num < 0)
		{
			throw new ArithmeticException("Number cannot be Negative");
		}
		else
		{
			int ans = 50/num;
			System.out.println("ans = "+ans);
		}
	}
}