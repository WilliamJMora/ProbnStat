package Accounts;

import java.util.ArrayList;

public class Client {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private ArrayList<Portfolio> portfoliosList;
	
	
	public Client(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.portfoliosList = new ArrayList<Portfolio>();
		
	}
	
	public String getfirstName() {
		return firstName;
		
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	public String getlastName() {
		return lastName;
	
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void addPortfolio(Portfolio portfoliosList) {
		portfoliosList.add(portfoliosList);
	}
	
	public Portfolio removePortfolio(int i) {
		return portfoliosList.remove(i);
	}
}
		


	