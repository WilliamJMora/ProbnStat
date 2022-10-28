package Accounts;

import java.util.ArrayList;
import java.util.List;

public class ClientLoader {

	List<Client> clientsList = new ArrayList<>();
	
	public List<Client> getClients() {
		return clientsList;
	}
	
	public void setClients(List<Client> clients) {
		this.clientsList = clients;
	}
	
}
