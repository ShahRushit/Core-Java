/*
Write a Java application which takes several command line arguments,
which are supposed to be names of students and prints output as given below:
(Suppose we enter 3 names then output should be as follows)..
Number of arguments = 3
1.: First Student Name is = Tom
2.: Second Student Name is = Dick
3.: Third Student Name is = Harry
Hint: An array may be used for converting from numeric values from 1 to 20 into String
*/
class P10
{
	public static void main(String str[])
	{
		int count = str.length;
		String s[] = new String[] {"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Nineth","Tenth","Eleventh","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
		System.out.println("The Number of Argument = " + count);

		for(int i=0;i<count;i++)
		{
			System.out.println((i+1) + ") " + s[i] +" Name = "+str[i]);
		}
	}
}
		// System.out.println("The Number of Argument = " + count(str));
		// System.out.println("First Name: " + str[0]);
		// System.out.println("Second Name: " + str[1]);
		// System.out.println("Third Name: " + str[2]);