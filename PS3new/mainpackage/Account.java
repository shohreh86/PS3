package mainpackage;

import java.util.Date;
import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date createdDate;
	Scanner user_input = new Scanner(System.in);

	public Account() {
	}
	public Account(int id, double balance, double annualInterestRate){
		this.setId(id);
		this.setBalance(balance);
		this.setAnnualInterestRate(annualInterestRate);
		this.createdDate= new java.util.Date();
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public java.util.Date getCreatedDate() {
		return createdDate;
	}
	public double getMonthlyInterestRate(){
		return balance*((annualInterestRate/100)/12);
	}

	public void withdraw(double amount) throws InsufficientFundsException{
		if (amount<= balance)
		{
		balance-=amount;
	}
		else
		{
			double needs= amount-balance;
			throw new InsufficientFundsException(needs);
		}
		}
		public void deposit(double amount)
		{
			balance += amount;
		}
		}
		
	
	

