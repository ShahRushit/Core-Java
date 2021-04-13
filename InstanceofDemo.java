class InstanceofDemo
{
	public static void main(String arg[])
	{
		String str = "Hello";
		Double d = new Double(10.0);

		if(str instanceof String)
		{
			System.out.println("str is an Instanceof String Class");
		}

		if(d instanceof Double)
		{
			System.out.println("d is an Instanceof Object Class");
		}

	}
}