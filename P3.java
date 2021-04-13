/*
	Write a java program to check palindrome number.
	Input: 329 Output: not palindrome number
	Input: 12321 Output: palindrome number.
*/

import java.util.Scanner;
class P3
{
	public static void main(String[] args)
	{
		int rev=0,no;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number:");
		no = s.nextInt();
		int i=no;
		while(i>0)
		{
			int rem = i%10;
			rev = rev*10+rem;
			i = i/10;
		}
		if(rev == no)
			System.out.println(no + " is Palindrome");
		else
			System.out.println(no + " is not Palindrome");

	}
}