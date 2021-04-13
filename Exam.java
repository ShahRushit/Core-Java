/*
Write a method for computing xy by doing repetitive multiplication. 
x and y are of type integer and are to be given as command line arguments. 
Raise and handle exception(s) for invalid values of x and y. 
Also define method main. Use finally in above program and explain its usage.
*/
class Exam
{
	static void power(int x,int y)
	{
		int pow = 1;
		int i = y;
		while(i > 0)
		{
			pow *= x;
			i--;
		}
		System.out.print("\tThe Power of " + x + " resto " + y + " = " + pow);
	}
	public static void main(String arg[])
	{
		System.out.println("\tStudent Name:      Rushit Shah");
		System.out.println("\tEnrollment Number: 195160693031");
		System.out.println("\n\t----------------------------------");
		try
		{
			int x,y;			
			x = Integer.parseInt(arg[0]);
			y = Integer.parseInt(arg[1]);	
			power(x,y);
			System.out.println("\n\t----------------------------------");
		}
		catch(NumberFormatException e)
		{
			System.out.println("\tOpps an Error occures:\n\t" + e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("\tOpps an Error occures:\n\t" + e);
		}
		catch(Exception e)
		{
			System.out.println("\tOpps an Error occures:\n\t" + e);
		}
		finally
		{
			System.out.println("\n\tProgram Successfully completed");
			System.out.println("\tThank You");
		}
	}
}
