// Import Scanner Class
import java.util.Scanner;

class Student_CopyConstructor
{
	String name;
	int age;
	Student_CopyConstructor()
	{
		name = "Rushit";
		age = 21;
	}
	Student_CopyConstructor(String name1,int age1)
	{
		name = name1;
		age = age1;
	}
	Student_CopyConstructor(Student_CopyConstructor s)
	{
		name = s.name;
		age = s.age;
	}
	void display()
	{
		System.out.println("Student Name = "+ name);
		System.out.println("Student Age = "+ age);
	}

	public static void main(String arg[])
	{
		 Student_CopyConstructor obj = new Student_CopyConstructor();
		 System.out.println("Content of Default Constructor");
		 obj.display();
		 System.out.println("");
		// Input takes from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = s.next();
		System.out.println("Enter Age: ");
		int age = s.nextInt();
		// create an object of Student_CopyConstructor with 2 args
		Student_CopyConstructor obj1 = new Student_CopyConstructor(name,age);
		System.out.println("Content of Parameterise Constructor with 2 args");
		obj1.display();
		System.out.println("");
		// create an object of Student_CopyConstructor with 1 object 
		Student_CopyConstructor obj2 = new Student_CopyConstructor(obj1);
		System.out.println("Content of Copy Constructor");
		obj2.display();
		System.out.println("");
	}
}