/*
	Write a java program to print factorial of a number.
 	Input: 5 Output: 120
	Input: 6 Output: 720
*/

import java.util.Scanner;
class P4
{
	public static void main(String args[])
	{
			int no=0,fact=1;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Number:");
			no = s.nextInt();
			int i=no;
			while(i>0)
			{
				fact = fact*i;
				i--;
			}
			System.out.println("Factorial of " + no +" = " + fact);
	}
}