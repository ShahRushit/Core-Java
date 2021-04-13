// Write a program to print fibonaci series between range which is given by user

import java.util.*;
class fibo
{
	public static void main(String[] args)
	{
		int no=0,no1=1,no2=0;
		int start,end;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number:");
		start = s.nextInt();
		System.out.println("Enter Ending Number:");
		end = s.nextInt();
		int i=0;
		if(start == 0)
		{
			System.out.println(0);
			System.out.println(1);
		} 
		while(i < end)
		{
			no2 = no + no1;
			if(no2 >= start && no2 <= end)
			{
				if(end >= no2)
					System.out.println(no2);
				else
					break;
			}
			no = no1;
			no1 = no2;
			i++;
		}	//While over	
	}	//	main over
}	// class over