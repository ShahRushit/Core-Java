class Shape
{
	int r;
	void area()
	{
		System.out.println("Demo Shape class using Overriding");
	}
}
class Circle extends Shape
{
	// double r;
	// Circle()
	// {
	// 	r = 10;
	// }

	void area()
	{
		r = 5;
		System.out.println("Demo Circle class using Overriding");
		double d = (double)(Math.PI*r*r);
		System.out.println(d);

	}
}
class DemoMethodOverriding
{
	public static void main(String[] args)
	{
		Shape s = new Shape();
		s.area();
		Circle c = new Circle();	
		c.area();
	}
}