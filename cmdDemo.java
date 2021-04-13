class cmdDemo
{
	public static void main(String arg[])
	{
		System.out.print("Hello ");
		System.out.println(arg[0]);
		// convert String to Integer
		int a = Integer.parseInt(arg[1]);
		int b = Integer.parseInt(arg[2]);
		int c = a+b;
		System.out.println(c);
	}
}