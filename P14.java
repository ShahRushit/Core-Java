/*
Create a class Rectangle that would contain length and width as data members.
Define constructors [constructor overloading (default, parameterized and copy)] 
to initialize the data members.
Define the member functions to find area and to display the number of objects created.
[Note: define initializer block, static initializer block and the static data member
and member function.
Also demonstrate the sequence of execution of initializer block and 
static initializer block]
*/
class Rectangle
{
	int length,width;
	
	static
	{
		System.out.println("Static Block1\n");
	}
	static
	{
		System.out.println("Static Block2");
	}

	{
		System.out.println("\nInitializer Block1\n");
	}
	{
		System.out.println("Initializer Block2\n");
	}

	Rectangle()
	{
		length = 10;
		width = 5;
	}

	Rectangle(int l,int b)
	{
		length = l;
		width = b;
	}

	Rectangle(Rectangle r)
	{
		System.out.println("---Copy Constructor Called---\n");
		length = r.length;
		width = r.width;
	}
	void display()
	{
		System.out.println("Area Of Rectangle = "+ (length*width));
	}
}
class P14
{
	public static void main(String[] args)
	{
		System.out.println("---Demo Of Constructor Overloading and Copy Constructor---\n");
		Rectangle r1 = new Rectangle(5,5);	
		r1.display();	
		Rectangle r = new Rectangle();	
		r.display();
		Rectangle r2 = new Rectangle(r1);
		r2.display();
	}
}