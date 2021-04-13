/*
	Define a class A in package apack. In class A, three variables are 
	defined of access modifiers protected, private and public. 
*/
package apack;
public class A
{
	public int x;
	private int y;
	protected int z;
	public A()
	{
		this.x = 10;
		this.y = 20;
		this.z = 40;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getZ()
	{
		return z;
	}
}