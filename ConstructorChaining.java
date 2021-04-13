class ConstructorChaining
{
	int no;
	String name;
	ConstructorChaining()
	{
		this.no = 10;
		this.name = "Rushit";
	}
	ConstructorChaining(int n)
	{	
		// this(); is used to call default constructor i.e ConstructorChaining()
		//	if we have nothing define here,only written 
		this();
		this.no = n;
		this.name = "ramesh";
	}
	ConstructorChaining(int n,String nm)
	{
		// this(n); is used to call 1 Parameter constructor 
		this(n);
		this.name = nm;
	}
	void display()
	{
		System.out.println("No : "+no);
		System.out.println("Name : "+name);
	}
	public static void main(String[] args)
	{
			ConstructorChaining c = new ConstructorChaining();
			System.out.println("Call Default Constructor");
			c.display();
			System.out.println("Call Default Constructor");
			c = new ConstructorChaining(5,"ramesh");
			c.display();
			c = new ConstructorChaining(11);
			c.display();
	}
}