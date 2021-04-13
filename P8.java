//	Write a program in Java to multiply two matrix

import java.util.*;
class P8
{
	public static void main(String str[])
	{
		int r1,r2,c1,c2,i,j,k,l;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Matrix1 row :");
		r1 = s.nextInt();
		System.out.print("Enter Matrix1 Column :");
		c1 = s.nextInt();	
		int m1[][] = new int[r1][c1];		
		int sum=0;
		
		System.out.println("Enter " + r1 +" * " + c1 +" Matrix1:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				m1[i][j] = s.nextInt();
			}
		}
			
		System.out.println("Data of " + r1 +" * " + c1 +" Matrix1:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				//m1[i][j] = s.nextInt();
				System.out.print(m1[i][j]+"  ");
			}
			System.out.println("");
		}
			
		System.out.print("Enter Matrix2 row :");
		r2 = s.nextInt();
		System.out.print("Enter Matrix2 Column :");
		c2 = s.nextInt();
		int m2[][] = new int[r2][c2];
			
		System.out.println("Enter " + r2 +" * " + c2 +" Matrix2:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				m2[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Data of " + r2 +" * " + c2 +" Matrix2:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				//m1[i][j] = s.nextInt();
				System.out.print(m2[i][j]+"  ");
			}
			System.out.println("");
		}
		int m3[][] = new int[r1][c2];
		if(c1==r2)
		{	
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					for(k=0;k<r2;k++)
					{
						sum = sum + m1[i][k]*m2[k][j];
					}
					m3[i][j] = sum;
					sum = 0;
				}
			}
			System.out.println("Matrix Multiplication : ");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(m3[i][j]+"  ");
				}
				System.out.println("");
			}
			
			
		}
		else
			System.out.println("We cant matrix multiplication because condition is not satisfied....");
	}
}
