package exam;
import student.*;
import java.util.Scanner;
public class Result extends Student
{
	public static int m1,m2,m3,m4,total;
	public static float avg;
	public static String cls;
	Scanner sc = new Scanner(System.in);
	public void getMark()
	{
		System.out.println("Enter your 4 Subject Marks");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		total = m1+m2+m3+m4;
		avg = total/4;
	}
	public static String pass1()
	{
		if(m1 > 50)
			return "Pass";
		else 
			return "Fail";
	}
	public static String pass2()
	{
		if(m2 > 50)
			return "Pass";
		else 
			return "Fail";
	}
	public static String pass3()
	{
		if(m3 > 50)
			return "Pass";
		else 
			return "Fail";
	}
	public static String pass4()
	{
		if(m4 > 50)
			return "Pass";
		else 
			return "Fail";
	}	
	public static String grade()
	{
		if(avg >= 70)
			// System.out.println("First");
			return "A";
		else if(avg >= 60)
			// System.out.println("First");
			return "B";
		else if(avg >= 50)
			// System.out.println("First");
			return "C";
		else
			// System.out.println("First");
			return "F";
	}
	
	public static void disp()
	{
		System.out.println("-----------------------------------------");
		System.out.println("\t\tMarksSheet\t");
		System.out.println("-----------------------------------------");
		System.out.println("Enrollment Number : " + enorllmentNo);
		System.out.println("Name              : " + name);
		System.out.println("Degree            : " + degree);
		System.out.println("Semester          : " + sem);
		System.out.println("-----------------------------------------");
		System.out.println(" Subject Name \t | Marks | Pass/Fail |");
		System.out.println("-----------------------------------------");
		System.out.println(" Fop-2 \t\t |  " + m1 + "   |    " + pass1() + "   |");
		System.out.println(" OS \t\t |  " + m2 + "   |    " + pass2() + "   |");
		System.out.println(" DS \t\t |  " + m3 + "   |    " + pass3() + "   |");
		System.out.println(" Java \t\t |  " + m4 + "   |    " + pass4() + "   |");
		System.out.println("-----------------------------------------");
		System.out.println("\tTotal\t | "+ total + "   |");
		System.out.println("-----------------------------------------");
		System.out.println("\tAverage\t | "+ avg + "  |");
		System.out.println("-----------------------------------------");
		System.out.println("\tGrade\t |  "+ grade() + "    |");
		System.out.println("-----------------------------------------");
	}
}