// Write a java program to checks the existence of a specified file.
import java.io.*;
class P38
{
	public static void main(String arg[]) 
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter File Name: ");
			String fname=br.readLine();
			System.out.println("You Entered: " + fname);
			File f = new File(fname);
			if(f.exists())
			{
				System.out.println("File Exists");
			}
			else
			{
				System.out.println("File does NOT exist");
			}
		}
		catch(Exception e)
		{
			System.out.println("Oops Error Occurs : " + e);
		}
	}
}

