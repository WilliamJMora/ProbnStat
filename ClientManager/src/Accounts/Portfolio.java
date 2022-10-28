package Accounts;

import java.util.ArrayList;

public class Portfolio {
	
	private String name;
	private ArrayList<Account> accountsList;
	
	public Portfolio(String name) {
		this.name = name;
		this.accountsList = new ArrayList<Account>();
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName() {
		this.name = name;
		
	}
	
	public void addAccount(Account account) {
		account.add(account);
		
	}
	
	public Account removeAccount(int i) {
		return accountsList.remove(i);
		
	}
	
	public void add(Portfolio portfoliosList) {
		
	}

}

