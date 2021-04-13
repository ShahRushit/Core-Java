/*
	Create a class Account containing accountNo, and balance as data members.
	Derive the Account class into two classes named Savings and Current.
	The Savings class should contain a data member named interestRate, and 
	the Current class should contain a data member called overdraftLimit. 
	Create appropriate member functions for all the classes to enable functionalities to
	check balance, deposit, and withdraw amount in Savings and Current account.
	[Ensure that the Account class cannot be instantiated.]
*/
import java.util.*;
abstract class Account
{
	double accountNo;
	float balance;
}
class Savings extends Account
{
	float interestRate;
	Savings()
	{
		interestRate = 0;
	}
	Savings(double accNo,float bal,float rate)
	{	
		this.accountNo = accNo;
		this.balance = bal;
		interestRate = rate;
	}
	//	Check Balance of Savings Account
	void checkBalance()
	{
		System.out.println("Your Saving Acoount Balance :"+balance);
	}
	//	Deposite Amount to Savings Account
	void deposite()
	{
		float dep;
		System.out.print("Enter Amount to Deposite to your Account :");
		Scanner sc = new Scanner(System.in);
		dep = sc.nextFloat();
		this.balance = balance + dep;
		System.out.println("Your Account Balance :"+balance);
	}
	//	Withdrawn Amount to Savings Account
	void withdraw()
	{
		float minBalance = 500.0f;
		float withdrawMoney;
		System.out.print("Enter Amount to Withdrawn :");
		Scanner sc = new Scanner(System.in);
		withdrawMoney = sc.nextFloat();
		if(balance <= minBalance)
		{
			System.out.println("You can't withdraw money...." + "Your Account Balance : "+balance);
		}
		else
		{
			balance = balance - withdrawMoney;
			System.out.println("You can withdraw money....");
			System.out.println("Your Account Balance :"+balance);
		}
	}

	void menu()
	{
		int c;
		do
		{
			System.out.println("-----MENU-----");
			System.out.println("1)Check Balance");
			System.out.println("2)Deposite");
			System.out.println("3)Withdraw");
			System.out.println("4)Exit");
			System.out.print("Enter Your Choice : ");
			Scanner sc = new Scanner(System.in);
			c = sc.nextInt();
			switch(c)
			{
				case 1:checkBalance();
						break;
				case 2:deposite();
						break;
				case 3:withdraw();
						break;
				case 4://System.exit(0);
						break;
				default:System.out.println("OOPS INVALID CHOICE.....");
						break;
			}
		}while(c >= 1 && c <= 3);
		
	}
}
class Current extends Account
{
	float overdraftLimit;
	Current(double accNo,float bal,float overLimit)
	{
		this.accountNo = accNo;
		this.balance = bal;
		overdraftLimit = overLimit;
	}
	//	Check Balance of Current Account
	void checkBalance()
	{
		System.out.println("Your Saving Acoount Balance :"+balance);
	}
	//	Deposite Amount to Current Account
	void deposite()
	{
		float dep;
		System.out.print("Enter Amount to Deposite to your Account :");
		Scanner sc = new Scanner(System.in);
		dep = sc.nextFloat();
		this.balance = balance + dep;
		System.out.println("Your Account Balance :"+balance);
	}
	//	Withdrawn Amount to Current Account
	void withdraw()
	{
		float minBalance = 500.0f;
		float withdrawMoney;
		System.out.print("Enter Amount to Withdrawn :");
		Scanner sc = new Scanner(System.in);
		withdrawMoney = sc.nextFloat();
		if(balance <= minBalance)
		{
			System.out.println("You can't withdraw money...." + "Your Account Balance : "+balance);
		}
		else
		{
			balance = balance - withdrawMoney;
			System.out.println("You can withdraw money....");
			System.out.println("Your Account Balance :"+balance);
		}
	}

	void menu()
	{
		int c;
		do
		{
			System.out.println("-----MENU-----");
			System.out.println("1)Check Balance");
			System.out.println("2)Deposite");
			System.out.println("3)Withdraw");
			System.out.println("4)Exit");
			System.out.print("Enter Your Choice : ");
			Scanner sc1 = new Scanner(System.in);
			c = sc1.nextInt();
			switch(c)
			{
				case 1:checkBalance();
						break;
				case 2:deposite();
						break;
				case 3:withdraw();
						break;
				case 4://System.exit(0);
						break;
				default:System.out.println("OOPS INVALID CHOICE.....");
						break;
			}
		}while(c >= 1 && c <= 3);
		
	}
}
class P19
{
	public static void main(String arg[])
	{
		int ch;
		double accountNumber;
		float balance;
		do
		{
			System.out.println("\n-----Welcome to ABC Bank-----\n");
			System.out.println("=====MENU=====");
			System.out.println("1)Savings");
			System.out.println("2)Current");
			System.out.println("3)EXIT");
			System.out.print("Enter Your Choice :");
			Scanner s = new Scanner(System.in);
			ch = s.nextInt();
			switch(ch)
			{
				case 1://Savings s1 = new Savings(20102486,1000,5);
						System.out.print("Enter Account Number : ");
						Scanner scann = new Scanner(System.in);
						accountNumber = scann.nextDouble();
						Savings s1 = new Savings(accountNumber,1000,5);
						s1.menu();
						break;
				case 2://Current c = new Current(20101085,1000,5000);
						System.out.print("Enter Account Number : ");
						Scanner scan = new Scanner(System.in);
						accountNumber = scan.nextDouble();
						Current c = new Current(accountNumber,1000,5000);
						c.menu();
						break;
				case 3:System.exit(0);
						break;
				default:System.out.println("Inavlid Choice.....");
						break;
			}	
		}while(ch>=1 && ch<=3);	
	}
}