interface Shape
{
	// all variables are public static final by default
	// we dont need to write it 
	int r = 5;
	int l=10;
	int b=5;
	public void area();
	public void display();
}

class Circle implements Shape
{
	// int r;
	// Circle()
	// {
	// 	r = 10;
	// }
	public void area()
	{
		// int r = 10;	
		double d = (double)(Math.PI*r*r);
		System.out.println("Area of Circle = "+d);
	}
	public void display()
	{

	}
}
class Rectangle implements Shape
{

	// int l,b;
	// Rectangle()
	// {
	// 	l = 10;
	// 	b = 5;
	// }
	public void area()
	{	
		// int b = 5;	
		int ans = l*b;
		System.out.println("Area of Rectangle = "+ans);
	}
	public void display()
	{

	}
}
class InterfaceDemo
{
	public static void main(String[] args)
	{
		// create variable of Shape interface
		Shape s1;
		// make an object for Circle class
		s1 = new Circle();
		s1.area();
		// make an object for Rectangle class
		s1 = new Rectangle();
		s1.area();
	}
}