class GetSetDemo
{
	int rno;
	String name;
	int age;
	GetSetDemo()
	{
		rno = 10;
		name = "Rushit";
		age = 21;
	}
	GetSetDemo(int x,String nm)
	{
		rno = x;
		name = nm;
		age = x;
	}
	void setRno(int r)
	{
		rno = r;
	}
	void setName(String nm)
	{
		name = nm;
	}
	void setAge(int ag)
	{
		age = ag;
	}
	int getRno()
	{
		return rno;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	void display()
	{
		System.out.println("RollNo : "+ rno);
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
	}
	public static void main(String[] args)
	{
		GetSetDemo g1 = new GetSetDemo();
		System.out.println("Content Default Constructor");
		g1.display();
		System.out.println("Content Setter Method");
		g1.setRno(31);
		g1.setName("Bataki");
		g1.setAge(19);
		g1.display();
		System.out.println("Content Getter Method");
		int a = g1.getRno();
		String b = g1.getName();
		int c = g1.getAge();
		System.out.println("ROll NO : "+a);
		System.out.println("NAME : "+b);
		System.out.println("AGE : "+c);
	}
}