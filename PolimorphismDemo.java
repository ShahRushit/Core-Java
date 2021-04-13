// Abstract class
abstract class Shape
{
	int r,l,b;
	abstract void area();
	void display()
	{
		System.out.println("This functon is calling by child class of Shape class");
	}
}
class Circle extends Shape
{
	
	void area()
	{
		r = 10;	// Variable of Super class Shape
		double ans = (double)(Math.PI*r*r);
		System.out.println("Area of Circle = "+ans);
	}
}
class Rectangle extends Shape
{
	void area()
	{
		l = 5;
		b = 3;
		System.out.println("Area of Rectangle is = "+(l*b));
	}
}
class Triangle extends Shape
{
	void area()
	{
		l = 10;	// Variable of Super class Shape
		b = 5;	// Variable of Super class Shape
		System.out.println("Area of Triangle is = "+((0.5)*l*b));
	}
}
class PolimorphismDemo
{
	public static void main(String arg[])
	{
		Shape s1;	// Variable of Shape class	
		// Dynamic Variable Dispatch
		s1 = new Circle();
		s1.area();
		s1 = new Rectangle();
		s1.area();
		s1 = new Triangle();
		s1.area();

		//	Call Non Abstract method which is written in Abstract class Shape 
		Circle c1 = new Circle();
		c1.display();
		Rectangle r1 = new Rectangle();
		r1.display();
		Triangle t1 = new Triangle();
		t1.display();
	}
}