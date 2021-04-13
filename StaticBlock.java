class StaticBlock
{
	static int num=10;
	static String mystr="hello";
	static
	{
		System.out.println("Static Block Content");
		num = 97;
		mystr = "Static keyword in java";
	}
	static
	{
		System.out.println("Static Block 2 Content");
		num = 100;
		mystr = "keyword in java";
	}
	void display()
	{
		System.out.println("Num = "+ num);
		System.out.println("Name = "+ mystr);
	}
	public static void main(String[] args) {
		// StaticBlock s = new StaticBlock();
		// s.display();
		System.out.println("Num = "+ num);
		System.out.println("Name = "+ mystr);
	}
}