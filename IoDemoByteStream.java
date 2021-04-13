import java.io.*;
class IoDemoByteStream
{
	public static void main(String[] args) {
		
		
		int i=0;
		try
		{
		
			FileInputStream f1 = new FileInputStream("p1.txt");
			// BufferedReader br = new BufferedReader(f1);
			FileOutputStream fw = new FileOutputStream("p2.txt");
			// BufferedWriter bw = new BufferedWriter(fw);
			
			while(i != -1)
			{
				i = f1.read();
				fw.write(i);
				System.out.print((char)i);		
			}
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("File not FOund");
		}
			
	}
}