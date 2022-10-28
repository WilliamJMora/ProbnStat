package Accounts;

public class CheckingAccount extends Account {

	public CheckingAccount(String accountNumber, double balance, String type) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
		
	}
	
	public String getDescription() {
		return accountNumber;
		
	}
	
	public double getValue() {
		return balance;
		
	}
	
	
}
