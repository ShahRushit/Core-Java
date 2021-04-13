/*
	Write a java program to count the availability of text lines in the particular file. 
	A file is read before counting lines of a particular file.
*/
import java.io.*;
import java.util.*;
class P42
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
				System.out.println("");
			else
				System.out.println("File not found");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			int count=0;
			while(br.readLine() != null)
				count++;
			System.out.println("Total Lines in abc.txt file = " + count);
		}
		catch(Exception e)
		{
			System.out.println("Error : " + e);
		}
	}
}