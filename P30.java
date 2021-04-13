/*
	Write a program in Java to demonstrate use of final class
*/
class FinalDemo
{
	final int a = 100;
	final public void demo()
	{
		final int x = 50;
		System.out.println("\nFinal Variable A = " + a);
		System.out.println("Final Variable X = " + x);
	}
}
class P30
{
	public static void main(String arg[]) 
	{
		FinalDemo fd = new FinalDemo();
		fd.demo();
	}
}
