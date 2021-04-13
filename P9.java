/*
	Write a java program to create a class “Matrix” that would contain integer values 
	having varied numbers of columns for each row. Print row-wise sum of the integer 
	values for each row.
*/

import java.util.*;
class P9
{
	public static void main(String str[])
	{
		int i,j,c,d;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Matrix row :");
		i = s.nextInt();
		System.out.print("Enter Matrix Column :");
		j = s.nextInt();
	
		int m1[][] = new int[i][j];
		//int m2[][] = new int[i][j];
		int sum=0;
		
		System.out.println("Enter " + i +" * " + j +" Matrix:");
		for(c=0;c<i;c++)
		{
			for(d=0;d<j;d++)
			{
				m1[c][d] = s.nextInt();
			}
		}
			
		System.out.println("Data of " + i +" * " + j +" Matrix:");
		for(c=0;c<i;c++)
		{
			for(d=0;d<j;d++)
			{
				//m1[i][j] = s.nextInt();
				System.out.print(m1[c][d]+"  ");
			}
			System.out.println("");
		}
		System.out.println("Sum of Matrix :");
		for(c=0;c<i;c++)
		{
			sum = 0;
			for(d=0;d<j;d++)
			{
				sum = sum + m1[c][d];
				
			}
			System.out.println("Row "+(c+1)+" sum = "+sum);
			
		}
	}
}
