import java.util.Scanner;
class f
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int start,end,s,e,flag=0;
 
		System.out.print("Enter Starting number :");
		start=sc.nextInt();
		System.out.print("Enter Ending number :");
		end=sc.nextInt();
		System.out.print("Prime Number :");
		for(s=start; s<=end; s++)
		{
			for(e = 2; e<s; e++)
			{
				if(s%e==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.print(+s+" ");
			}
		}
		System.out.print("fibonacci Number :");
		int f1 = start, f2 = 1, f3 = 0; 
		while (f3 < end) 
		{ 
			f3=f1+f2;
			if (f3<end) 
			{
				System.out.print(+f3+" ");
			}
			f1 = f2; 
			f2 = f3; 
		}
	}
}