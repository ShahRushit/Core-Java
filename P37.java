// 	Write a java program to illustrates use of standard input stream to read the user input.
import java.io.*;
class P37
{
	public static void main(String arg[]) 
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Name: ");
			String name = br.readLine();
			System.out.println("-------------------------");
			System.out.println("You Entered: " + name);
		}
		catch(Exception e)
		{
			System.out.println("Oops Error occurs : " + e);
		}		
	}
}