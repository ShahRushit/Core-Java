/*
Create a class Student that would contain enrollmentNo, name, and gender as data members.
Create appropriate getter and setter methods for the Student class and constructors to initialize
the data members. Also demonstrate constructor chaining
*/
class Student 
{
	int enrollmentNo;
	String name;
	String gender;
	Student()
	{
		System.out.println("Default Constructor Student\n");
		enrollmentNo = 31;
		name = "Rushit Shah";
		gender = "Male";
	}
	Student(int no,String name)
	{
		this(no);
		System.out.println("Parameterise Constructor 2 Student\n");
		enrollmentNo = no;
		this.name = name;
		gender = "Female";
	}
	Student(int no)
	{
		this();
		enrollmentNo = no;
		name = "Nishu Bhardwaj";
		gender = "Male";
		System.out.println("Parameterise Constructor 1 Student\n");

	}
	
	void setEnrollmentNo(int no)
	{
		enrollmentNo = no;
	}
	void setName(String nm)
	{
		name = nm;
	}
	void setGender(String sex)
	{
		gender = sex;
	}
	int getEnrollmentNo()
	{
		return enrollmentNo;
	}
	String getName()
	{
		return name;
	}
	String getGender()
	{
		return gender;
	}
	void display()
	{
		System.out.println("Student Enrollment No : "+ enrollmentNo);
		System.out.println("Student Name          : "+ name);
		System.out.println("Student Gender        : "+ gender);
	}
}
class P12
{
	public static void main(String[] args)
	{
		System.out.println("\nConstructor Chaining Demo\n");
		Student s = new Student();
		s.display();
		Student s1 = new Student(2);
		s1.display();
		Student s2 = new Student(3,"Dipika");
		s2.display();
		s.setEnrollmentNo(101);
		s.setName("Katrina");
		s.setGender("Female");
		System.out.println("\nContent of Getter Method");
		int no = s.getEnrollmentNo();
		String name = s.getName();
		String gender = s.getGender();
		System.out.println("Student Enrollment No : "+ no);
		System.out.println("Student Name          : "+ name);
		System.out.println("Student Gender        : "+ gender);
	}
}