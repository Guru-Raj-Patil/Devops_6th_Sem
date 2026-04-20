package com.bnmit;

class BankAccount
{
	double balance;
	BankAccount(double b)
	{
		balance = b;
	}
	void deposit(double amount)
	{
		if(amount>0)
		{
			balance += amount;
			System.out.println("Balance after deposit of 500:  "+balance);
		}
	}
	void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance -= amount;
			System.out.println("Balance after withdrawal of 100: "+balance);
		}
	}
}
	public class BankService
	{
		public static void main(String[] args)
		{
			BankAccount acc = new BankAccount(5000);
			System.out.println("Initial balance: "+acc.balance);
		
			acc.deposit(500);
			acc.withdraw(100);
			
			System.out.println("Final Balance: "+acc.balance);
		}
	}
			