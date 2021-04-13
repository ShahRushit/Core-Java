//Write a java program which should display maximum and minimum number of given 3 numbers. 
import java.util.*;
class Max
{
	
	void large(int a,int b,int c)
	{
		int maximum = (a > b)?(a > c ? a : c):(b > c ? b:c);
		System.out.println("Maximum no is " + maximum);
	}
}
class Min
{
	//Min(){}
	void small(int a,int b,int c)
	{
		int minimum = (a < b)?(a < c ? a : c):(b < c ? b:c);
		System.out.println("Minimum no is " + minimum);
	}
}
class P7
{
	public static void main(String arg[])
	{
		int no,no1,no2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		no = s.nextInt();
		System.out.println("Enter 2nd Number:");
		no1 = s.nextInt();
		System.out.println("Enter 3rd Number:");
		no2 = s.nextInt();
		Max m1 = new Max();
		Min m2 = new Min();
		m1.large(no,no1,no2);
		m2.small(no,no1,no2);
	}
}
