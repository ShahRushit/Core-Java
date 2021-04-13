/*
	Write a program to pass Starting and Ending limit and print all prime numbers 
	and Fibonacci numbers between this range.
*/

import java.util.*;
class P2
{
	public static void main(String arg[])
	{
		int start,end;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Starting position :");
		start = s.nextInt();
		System.out.print("Enter Ending position :");
		end = s.nextInt();
		Fibo f = new Fibo();
		f.fibo(start,end);
		Prime p = new Prime();
		p.prime(start,end);		
	}
}
class Fibo
{
	
	void fibo(int s,int e)
	{
		int spos,epos,a = 0, b = 1, c =0;
		spos = s;
		epos = e;
		System.out.println("Fibonaci Series from " + spos + " to " + epos + " :\n");
		if(s == 0)
		{
			System.out.print(0 + "  ");
			System.out.print(1 + "  ");
		}
		else if(s == 1)
			System.out.print(1 + "  ");
		int i=0;
		while(i<=epos)
		{
			c = a+b;
			if(c>=spos && c<=epos)
			{
				if(epos >= c)
					System.out.print(c + "  ");
				else
					break;
			}
			a=b;
			b=c;
			i++;
		}
	}
}

class Prime
{
	
	void prime(int s,int e)
	{
		int spos,epos,i,j,flag;
		i=1;
		j=0;
		spos = s;
		epos = e;
		flag=0;
		System.out.print("\n \n");
		System.out.println("Prime Number from " + spos + " to " + epos + " :\n");
		if(spos == 0 || spos == 1 || spos == 2)
			System.out.print(2 + "  ");
		for(i = spos;i<=epos;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = 0;
					break;
				}
				else
					flag = 1;
			}
			if(flag ==1)
				System.out.print(i + "  ");
		}	
		System.out.println("");
	}
}