class Circle
{
	double radius,ans;
	static int count;
	static 
	{
		count=0;
	}
	Circle()
	{
		count++;
	}
	Circle(double rad)
	{
		this();
		this.radius = rad;
	}
	void area()
	{
		ans = Math.PI*radius*radius;
		System.out.println("Area of Circle :"+ans);
	}
	
}
class P17_1
{
	public static void main(String[] args) {
		Circle c = new Circle(2);
		c.area();
		Circle c1 = new Circle(4);
		c1.area();
		Circle c2 = new Circle(6);
		c2.area();
		Circle c3 = new Circle(1);
		c3.area();
		System.out.println("Total Number of instances :"+count);
	} 
}
