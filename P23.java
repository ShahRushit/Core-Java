/*
	Describe abstract class called Shape which has three subclasses 
	say Triangle,Rectangle, and Circle. Define one method area () in the abstract class 
	and override this area () in these three subclasses to calculate for specific object
	i.e. area () of Triangle subclass should calculate area of triangle etc. 
	Same for Rectangle and Circle.
*/
abstract class Shape
{
	abstract public void area();
}
class Triangle extends Shape
{
	int h,b;
	Triangle()
	{
		h = 20;
		b = 12;
	}
	public void area()
	{
		System.out.println("Area Of Triangle  : "+((h*b)/2));
	}
}
class Rectangle extends Shape
{
	int l,b;
	Rectangle()
	{
		l = 10;
		b = 20;
	}
	public void area()
	{
		System.out.println("Area Of Rectangle : "+(l*b));
	}
}
class Circle extends Shape
{
	double r;
	Circle()
	{
		r = 5;
	}
	public void area()
	{
		System.out.println("Area Of Circle    : "+(Math.PI*r*r));
	}
}
class P23
{
	public static void main(String arg[])
	{
		System.out.println("-----Demo Of Method Overriding using Abstract Class-----");
		Triangle objT = new Triangle();
		objT.area();
		Rectangle objR = new Rectangle();
		objR.area();
		Circle objC = new Circle();
		objC.area();	
	}
}