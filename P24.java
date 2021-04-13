/*
	Write a java program to implement an interface called Exam with a method
	Pass (int mark) that returns a boolean. 
	Write another interface called Classify with a method Division (int average) 
	which returns a String. 
	Write a class called Result which implements both Exam and Classify. 
	The Pass method should return true if the mark is greater than or equal to 50 else false. 
	The Division method must return First when the parameter average is 60 or more, 
	Second when average is 50 or more but below 60, No division when average is less than 
	50.
*/
import java.util.Scanner;
interface Exam
{
	public boolean Pass(int mark);
}
interface Classify
{
	public String Division(int average);
}
class Result implements  Exam,Classify
{
	public boolean Pass(int mark)
	{
		if(mark > 50)
			return true;
		else
			return false;
	}
	public String Division(int average)
	{
		if(average >= 60)
			return "First";
		else if(average >= 50)
			return "Second";
		else
			return "No Division";
	}
}
class P24
{
	public static void main(String arg[]) 
	{
		System.out.print("Enter Your Name : ");
		Scanner st = new Scanner(System.in);
		String name = st.next();
		System.out.print("Enter Your Marks : ");
		Scanner m = new Scanner(System.in);
		int varMark = m.nextInt();
		System.out.print("Enter Your Average : ");
		Scanner a = new Scanner(System.in);
		int varAverage = a.nextInt();
		Result r = new Result();
		boolean varPass = r.Pass(varMark);
		String str = r.Division(varAverage);
		System.out.println("-------------------");
		System.out.println("Your Name  : "+name);
		System.out.println("Your Marks : "+varPass);
		System.out.println("Your Grade : "+str);
	}
}