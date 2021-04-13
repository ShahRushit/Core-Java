/*
	Define class ProtectedDemo in package dpack in which write main () method. 
	Create objects of class B and C and class display method for both these objects.
*/
package dpack;
import apack.*;
import bpack.*;
import cpack.*;
public class ProtectedDemo
{
	public static void main(String arg[]) 
	{
		B objB = new B();
		objB.display();
		C objC = new C();
		objC.display();
	}
}