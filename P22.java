/*
	Write a java program to illustrates how to access a hidden variable. 
	Class A declares a static variable x. The class B extends A and declares
	an instance variable x. display ( ) method in B displays both of these variables.
*/
class A
{
	static int x;
	A()
	{
		x = 10;
	}
	
}
class B extends A
{
	int x;
	B()
	{
		x = 50;
	}
	void display()
	{
		System.out.println("Class A variable X Value :"+super.x);
		System.out.println("Class B variable X Value :"+x);
	}
}
class P22
{
	public static void main(String arg[])
	{
		System.out.println("\n-----Demo Of Variable Hiding-----\n");
		B obj = new B();
		obj.display();
	}
}
