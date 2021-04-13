/*
	Write a class circle with radius as data member and count the number of instances 
	created using default constructor only. [Constructor Chaining]
*/
class Circle
{
	double radius;
	double ans;
	static int numOfObj;
	static 
	{
		numOfObj = 0;
	}
	Circle()
	{
		numOfObj++;
	}
	Circle(double r)
	{
		this();
		// setRadius(r);
		radius = r;
	}
	// double getRadius()
	// {
	// 	return radius;
	// }
	// void setRadius(double rad)
	// {
	// 	radius = rad;
	// }
	void area()
	{
		ans = Math.PI*radius*radius;
		System.out.println("Area of Circle : "+ans);
	}
}
class P17
{
	public static void main(String arg[])
	{
		Circle c = new Circle(1);
		// c.setRadius(3);
		c.area();
		Circle c1 = new Circle(4);
		c1.area();
		Circle c2 = new Circle(3.14);
		c2.area();
		System.out.println("Total Instance Create :"+Circle.numOfObj);

	}
}