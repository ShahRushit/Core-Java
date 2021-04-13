import java.util.*;
class p2
{
	public static void main(String[] args)
	{
		int no=0,no1=1,no2;
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		num = s.nextInt();
		int i=2;
		System.out.println(no);
		System.out.println(no1);
		while(i<num)
		{
			no2 = no + no1;
			if(num > no2)
			{
				System.out.println(no2);
			}
			else
				break;
			no = no1;
			no1 = no2;
			i++;
		}
	}
}