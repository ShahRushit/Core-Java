// Exception,ArithmaticException,ArrayIndexOutofBound
class ExceptionDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Before Exceeption");		
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);	
			int c = b/a;	
			System.out.println("Ans : " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("User can not enter 0");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Enter Command Line Argument");
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println("Enter Only Integer Numbers");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("User can not enter 0");
		}
		System.out.println("Hello After Exceeption");
	}
}