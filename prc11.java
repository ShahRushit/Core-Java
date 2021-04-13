public class prc11
{
    public static void main(String[] args) 
	{		
		if(args.length<=0)
		{
			System.out.println("Enter a string using command line");
		}
		else
		{
			String txt = args[0];
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
			System.out.println("String  : " + args[0]);
			System.out.println("Letters : " + letters);
			System.out.println("Digits  : " + digits );
			System.out.println("Others  : " + others );
		}
	}
}