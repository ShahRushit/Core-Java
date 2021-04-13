/*
Write a program in Java to demonstrate use of this keyword.
Check whether this can access the private members of the class or not.
[Refer class student in Q12 to perform the task]
*/
class Student 
{
	private int enrollmentNo;
	private String name;
	private String gender;
	Student()
	{
		System.out.println("Default Constructor Student\n");
		this.enrollmentNo = 31;
		this.name = "Rushit Shah";
		this.gender = "Male";
	}
	Student(int no)
	{
		this();
		this.enrollmentNo = no;
		this.name = "Nishu Bhardwaj";
		this.gender = "Male";
		System.out.println("Parameterise Constructor 1 Student\n");
	}
	
	void display()
	{
		System.out.println("Student Enrollment No : "+ enrollmentNo);
		System.out.println("Student Name          : "+ name);
		System.out.println("Student Gender        : "+ gender);
	}
}
class P13
{
	public static void main(String[] args)
	{
		System.out.println("\n------This Keyword Demo------\n");
		Student s = new Student();
		s.display();
		Student s1 = new Student(2);
		s1.display();
	}
}