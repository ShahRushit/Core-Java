class Circle
{
	double r;
	Circle()
	{
		r = 10;
	}
	Circle(int x)
	{
		r = x;
	}
	void area()
	{
		double a;
		a = Math.PI*r*r;
		System.out.println(a);
	}
	void area(int y)
	{
		r = y;
		double a;
		a = Math.PI*r*r;
		System.out.println(a);
		// a = 3.14*r*r;
	}
}
class CircleDemo
{
	public static void main(String[] args)
	{
		
		Circle c1 = new Circle();
		c1.area();	
		
		Circle c2 = new Circle();
		c2.area(5);
		
		Circle c3 = new Circle(25);
		c3.area();
		
		Circle c4 = new Circle(20);
		c4.area();
		
		Circle c5 = new Circle();
		c5.area(15);
	}
}