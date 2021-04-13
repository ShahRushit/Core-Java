/*
	Write a program in Java to demonstrate the use of 'final' keyword in 
	the field declaration. How it is accessed using the objects.
*/
class DemoFinal
{
	final int x;
	// final static int x
	DemoFinal()
	{
		this.x = 100;
		System.out.println("Value of X : "+this.x);
	}
	// static
	// {
	// 	x = 20;
	// 	System.out.println("Value of X : "+x);
	// }
}
class P21
{
	public static void main(String[] args)
	{
		DemoFinal d = new DemoFinal();	
		System.out.println("Using Object Value Of X : "+d.x);
	}
	
}