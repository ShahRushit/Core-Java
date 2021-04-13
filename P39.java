//	Write a java program to create a file to the specified location. 
import java.io.*;
class P39
{
	public static void main(String arg[]) 
	{
		try
		{
			String location;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nEnter Location: ");
			location=br.readLine();	
			System.out.println("-------------------------------------");
			System.out.print("Enter New File Name: ");
			String fname=br.readLine();
			System.out.println("-------------------------------------");
			File fl=new File(location + "\\" + fname);
			fl.createNewFile();
			FileWriter fw = new FileWriter(fl);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello World");
			bw.flush();
			bw.close();
			System.out.println("\n" + fname + " is created successfully.");
		}
		catch(Exception e)
		{
			System.out.println("Error :" + e);
		}
	}
}