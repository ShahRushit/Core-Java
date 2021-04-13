/*
	Write a java program to check Armstrong number.
	Input: 153 Output: Armstrong number
	Input: 22 Output: not Armstrong number
*/

import java.util.Scanner;
public class P5 
{
    public static void main(String[] args) 
    {
		int no,rem,arm=0,tmp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number:");
		no = s.nextInt();
		tmp=no;
		while(tmp>0)
		{
			rem = tmp%10;
			arm = arm+(rem*rem*rem);
			tmp = tmp/10;
		}
		if(no == arm)
			System.out.println(no + " is an Armstrong Number ");		
		else
			System.out.println(no + " is not an Armstrong Number");
    }
}