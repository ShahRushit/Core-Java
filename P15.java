/*
	Write a java program static block which will be executed before main ( ) method 
	in a class.
*/
class P15
{
	static
	{
		System.out.println("Static Block Called....");
		System.out.println("Static block always called before Main() method");
	}
	public static void main(String[] args)
	{
		System.out.println("Main() method Called....");
	}
}