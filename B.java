/*
	Define class B in package bpack which extends A and write display method 
	which accesses variables of class A. 
*/
package bpack;
import apack.*;
public class B extends A
{
	public void display()
	{
		System.out.println("Display Data using Variable");
		System.out.println("Value of Public Variable X    : "+this.x);
		// System.out.println("Value of Private Variable Y : "+this.y);	// Compile time Error
		System.out.println("Value of Protected Variable Z : "+this.z);
	}
}