import java.io.*;
class IoDemo
{
	public static void main(String[] args) {
		
		
		int i=0;
		try
		{
			FileReader f1 = new FileReader("p1.txt");
			FileWriter fw = new FileWriter("p2.txt");
			// i = f1.read();	
			while(i != -1)
			{
				i = f1.read();
				fw.write(i);
				// System.out.print((char)i);		
			}
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("File not Found");
		}
			
	}
}