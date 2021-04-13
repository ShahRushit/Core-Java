//  Write a program in Java to create, write, modify, read operations on a Text file
import java.io.*;
class P36
{
	public static void main(String arg[]) 
	{
		try
		{
			String str;
			File file = new File("sample.txt");
			file.createNewFile();
			FileWriter fw=new FileWriter(file);
			fw.write("hello world");
			fw.close();

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			str=br.readLine();
			System.out.println("------------------------------");
			System.out.println("Data = " + str);
			String abc=" Java Program";
			String str1="";
			if(!str.isEmpty())
			{
				str1=str.concat(abc);
			}
			br.close();
			System.out.println("------------------------------");
			System.out.println("After Modify data = " + str1);
			System.out.println("------------------------------");
			file = new File("sample.txt");
			file.createNewFile();
			fw=new FileWriter(file);
			// bw = new BufferedWriter(fw);
			fw.write(str1);
			// bw.flush();
			fw.close();
			// fr = new FileReader(file);
			// br = new BufferedReader(fr);
			// str=br.readLine();
			// System.out.println(str);

		}
		catch(Exception e)
		{
			System.out.println("Error Occurs.......\nFile Not Found");
		}
	}
}