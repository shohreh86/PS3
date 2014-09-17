package mainpackage;

import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	static DateFormat Date = DateFormat.getDateInstance(DateFormat.LONG,
			Locale.US);
	Scanner user_input = new Scanner(System.in);

	public Account() {
	}

	public Account(int id, double balance) {
		this.setId(id);
		this.setBalance(balance);
	}

	 //return the id
	 
	public int getId() {
		return id;
	}

	 //set the id to set
	 
	public void setId(int id) {
		this.id = id;
	}

	
	 //return the balance
	 
	public double getBalance() {
		return balance;
	}

	
	 //set the balance to set
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	 //return the annual Interest Rate
	 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	
	// set the annual Interest Rate 
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//return the date
	
	public DateFormat getDate() {
		return Date;
	}

	public double getMonthlyInterestRate() {
		return (getAnnualInterestRate() / 12);
	}

	public double withdraw(double d) {
		double newBalance;
		double finalValue;
		System.out.println("How much money to WITHDRAW? ");
		newBalance = user_input.nextDouble();
		finalValue = (getBalance() - newBalance);
		return finalValue;
	}

	public double deposit(double d) {
		double DepositMoney;
		double newBalance;
		System.out.println("How much money to DEPOSIT? ");
		DepositMoney = user_input.nextDouble();
		newBalance = (getBalance() + DepositMoney);
		return newBalance;
	}
}