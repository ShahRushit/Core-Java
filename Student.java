package student;
import java.util.*;
public class Student
{
	public static String name,degree;
	public static int enorllmentNo,sem;
	Scanner sc = new Scanner(System.in);
	// public Student()
	// {
	// 	enorllmentNo = 0;
	// 	name = "";
	// 	degree = "";
	// 	sem = 0;
	// }
	public void info()
	{
		System.out.print("Enter your Enrollment Number : ");
		enorllmentNo = sc.nextInt();
		System.out.print("Enter your Name : ");
		name = sc.next();
		System.out.print("Enter your Degree : ");
		degree = sc.next();
		System.out.print("Enter your Sem : ");
		sem = sc.nextInt();
	}
}
