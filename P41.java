/*
	Write a java program to first checks the existence of the specified file.
	If the file exists, the data is written to the file through the object of 
	the FileOutputStream class.
*/
import java.io.*;
import java.util.*;
class P41
{
	public static void main(String arg[]) 
	{
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter File Name: ");
			String fname = sc.next();
			File f = new File(fname);
			
			if(f.exists())
			{
				System.out.println(fname + "file is exist");
				FileOutputStream fos = new FileOutputStream(f);
				String str;
				System.out.print("Enter string: ");
				Scanner sc1 = new Scanner(System.in);
				str=sc1.nextLine();
				byte b[]=str.getBytes();
				fos.write(b);
				fos.close();
			}
			else
			{
				System.out.println(fname + " File does not exists");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e);
		}
	}
}