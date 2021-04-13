class WrapperDemo
{
	public static void main(String[] args)
	{
		Integer myInt = 5;
		Double myDouble = 19.0;
		Character myChar = 'A';
		int a1 = myInt.intValue();
		System.out.println(a1);
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());	

		//Autoboxing
		int a=20;
		Integer i = Integer.valueOf(a);// converting Explicitly
		System.out.println("Autoboxing");
		Integer j = a;	//	converting internally means Compiler automatically added Integer.valueOf(a)
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		//Unboxing
		System.out.println("Unboxing");
		int x = i.intValue();
		System.out.println(i);
		System.out.println(x);
		// Integer aa = new Integer(4);
		// int p = aa.intValue();
		// System.out.println(p);
	}
}