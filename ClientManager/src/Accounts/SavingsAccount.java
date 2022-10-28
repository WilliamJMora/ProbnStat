package Accounts;

public class SavingsAccount extends Account {

	public SavingsAccount(String accountNumber, double balance, String type) {
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
