import java.util.Scanner;
class p4
{
	public static void main(String[] args)
	{
		// factorial();
		// void factorial()
		// {
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
		// }
	}
}