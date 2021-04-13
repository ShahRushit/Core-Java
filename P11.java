/*	Write a Java application to count and display frequency of letters and digits 
	from the String given by user as command-line IllegalArgumentException*/
class P11
{
	public static void main(String arg[])
	{
		if(arg.length<=0)
		{
			System.out.println("Enter a string using command line");
		}
		else
		{
			String txt = arg[0];
			int letters = 0, digits = 0,others = 0;

			txt = txt.toLowerCase();
			for(int i = 0; i < txt.length(); ++i)
			{				
				//	returns char value for the particular index
				char ch = txt.charAt(i);	//	char charAt(int index)	
				if((ch >= 'a' && ch <= 'z')) 
				{
					letters++;
				}
				else if( ch >= '0' && ch <= '9')
				{
					digits ++;
				}	
				else
				{
					others ++;
				}			
			}	
			System.out.println("String            : " + arg[0]);
			System.out.println("Letters           : " + letters);
			System.out.println("Digits            : " + digits );
			System.out.println("Others            : " + others );
			System.out.println("Toatal Characters :" + (letters+digits+others));
		}
	}
}