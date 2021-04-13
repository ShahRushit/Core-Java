// Write a java program to demonstrate the way contents are read from a file.
import java.io.*;
import java.util.*;
class P40
{
		public static void main(String[] args)
		{
			try
			{
				Scanner s = new Scanner(System.in);
				//create a FileReader Object by providing File name in the constructor
				System.out.print("Enter File Name: ");
				String fname = s.next();
				FileReader fr = new	FileReader(fname);
				int c; //this will contain the character value as int
				while ((c = fr.read()) != -1)
				{
					System.out.print((char)c);
				}
				fr.close();
			}
			catch (FileNotFoundException e)
			{
				System.out.println("Error: " + e);
			}
			catch (IOException e1)
			{
				System.out.println("Error: " + e1);
			}

		}
}

