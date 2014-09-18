package mainpackage;

public class Test_case extends Account {
	public static void main(String[] args){

		
		
	Account testing = new Account(1122, 20000, 4.5);
	
	testing.deposit(3000);
	System.out.println("Balance: $" + testing.getBalance());
	System.out.println("Created on: "+ testing.getCreatedDate());
	System.out.println("Monthly interest: $"+ testing.getMonthlyInterestRate());
	try{
	testing.withdraw(2500);
	System.out.println("Balance after drawing $2500: "+ testing.getBalance());
	
	System.out.println("Trying to draw $40000!!!");
	testing.withdraw(40000);
	}
	catch (InsufficientFundsException e){
		System.out.println("You have to deposit $"+ e.getAmount()+ "to be able to draw again");
		e.printStackTrace();
	}
	}
	

 

}
