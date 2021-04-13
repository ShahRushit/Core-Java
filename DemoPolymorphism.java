abstract class Shape
{
	int r;
	abstract void area();
	// {
	// 	// System.out.println("Demo Shape class using Overriding");
	// }
	void display()
	{
		System.out.println("Hello");
	}
}
class Circle extends Shape
{
	void area()
	{
		r = 5;	// var of super class Shape
		System.out.println("Demo Circle class using Overriding");
		double d = (double)(Math.PI*r*r);
		System.out.println(d);

	}
}
class Rectangle extends Shape
{
	void area()
	{	
		int l,b;
		l = 5;
		b = 10;
		int rect = l*b;
		System.out.println("Area of Rectangle is" + rect);
	}	
}
class Triangle extends Shape
{
	void area()
	{
		int l,b;
		l = 10;
		b = 20;
		// int tri = ((l*b)*(1/2));
		int tri = (l*b)*(1/2);
		System.out.println("Area of Triangle is : " + tri);
	}
}
class DemoPolymorphism
{
	public static void main(String[] args) {
	//	Shape s1 = new Shape();	 // We cant create object of it because its abstract class
	//	s1.area();

		// s1 = new Circle();
		// s1.area();
		// s1 = new Rectangle();
		// s1.area();
		Triangle s1 = new Triangle();
		s1.area();
		s1.display();
		// Shape s2 = new Circle();
		// s2.area();
		// Shape s3 = new Rectangle();
		// s3.area();
		// Shape s4 = new Triangle();
		// s4.area();
		// Circle c1 = new Circle();
		// // Circle c2 = new Shape();
	}
}