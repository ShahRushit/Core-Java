//	Write a program in Java to find maximum of three numbers using conditional operator

import java.util.*;
class P6
{
	public static void main(String str[])
	{
		int no1,no2,no3,max;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Value Of No1:");		
		no1 = s.nextInt();
		System.out.println("Enter The Value Of No2:");
		no2 = s.nextInt();
		System.out.println("Enter The Value Of No3:");
		no3 = s.nextInt();
		max = (no1 > no2)?(no1 > no3 ? no1 : no3):(no2 > no3 ? no2 : no3);
			
		System.out.println("Maximum no is " + max);
	}
}