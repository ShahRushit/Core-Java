/*
	Define class C in package cpack which has one method display() in that 
	create one object of class A and display its variables. 
*/
package cpack;
import apack.*;

public class C extends A
{
	A objA = new A();
	public void display()
	{
		System.out.println("-------------------------------------");
		System.out.println("Using Object Call Variable ");
		System.out.println("Value of Public Variable X    : "+objA.getX());
		System.out.println("Value of Private Variable Y   : "+objA.getY());
		System.out.println("Value of Protected Variable Z : "+objA.getZ());
	}
}