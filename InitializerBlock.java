class InitializerBlock
{
	int num = 10;
	 String mystr = "hello";
	{
		System.out.println("Initializer Block Content");
		num = 97;
		mystr = "Initializer in java";
	}
	// static{
	// 	System.out.println("Static Block 2 Content");
	// 	num = 100;
	// 	mystr = "keyword in java";
	// }

	void display()
	{
		System.out.println("Num = "+ num);
		System.out.println("Name = "+ mystr);
	}

	public static void main(String[] args)
	{
		InitializerBlock s = new InitializerBlock();
		s.display();
		InitializerBlock s1 = new InitializerBlock();
		s1.display();
		// System.out.println("Num = "+ num);
		// System.out.println("Name = "+ mystr);
	}
}