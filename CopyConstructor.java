class A
{
	int a,b;
	// Default Constructor
	A()
	{
		this.a=10;
		this.b=20;
	}

	// Define Constructor with 1 arg
	A(int x)
	{
		this.a=100;
		this.b=x;
	}

	// Define Constructor with 2 args
	A(int x,int y)
	{
		this.a=x;
		this.b=y;
	}

	//Copy Constructor
	A(A obj)
	{
		this.a = obj.a;
		this.b = obj.b;
	}
}
class CopyConstructor
{
	public static void main(String arg[])
	{
		//Default Constructor Call
		A obj = new A();
		System.out.println("Default Constructor");
		System.out.println("Value of a = "+obj.a);
		System.out.println("Value of b = "+obj.b);

		// Call constructor with 1 arg
		A obj2 = new A(200);
		System.out.println("Constructor Overloading with 1 arg");
		System.out.println("Value of a = "+obj2.a);
		System.out.println("Value of b = "+obj2.b);

		// Call Constructor which have 2 args
		A obj3 = new A(20,30);
		System.out.println("Constructor Overloading with 2 args");
		System.out.println("Value of a = "+obj3.a);
		System.out.println("Value of b = "+obj3.b);

		//Call Copy Constructor
		A obj4 = new A(obj);
		System.out.println("Copy Constructor");
		System.out.println("Value of a = "+obj4.a);
		System.out.println("Value of b = "+obj4.b);

	}
}