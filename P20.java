/*
	Write a program in Java in which a subclass constructor invokes the constructor of the
	super class and instantiate the values.
	[ refer class Account and sub classes savingAccount and CurrentAccount 
	in Q 19 for this task]
*/
abstract class Account
{
	String accountNumber;
	float balance;
	Account()
	{
		accountNumber = "";
		balance = 0.0f;
	}
	public abstract void display();
}
class Savings extends Account
{
	Savings(String accNo,float bal)
	{
		this.accountNumber = accNo;
		this.balance  = bal;
	}
	public void display()
	{
		System.out.println("Your Saving Account Number  : "+accountNumber);
		System.out.println("Your Balance                : "+balance);
	}
}
class Current extends Account
{
	Current(String accNo,float bal)
	{
		this.accountNumber = accNo;
		this.balance  = bal;	
	}
	public void display()
	{
		System.out.println("Your Current Account Number : "+accountNumber);
		System.out.println("Your Balance                : "+balance);
	}
}
class P20
{
	public static void main(String arg[])
	{
		System.out.println("\n----------Welcome to ABC Bank----------\n");
		Savings s = new Savings("020101457",50000);
		s.display();
		System.out.println("\n---------------------------------------\n");
		Current c = new Current("050101707",100000);
		c.display();
	}
}