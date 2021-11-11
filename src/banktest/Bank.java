package banktest;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	List<Client> clients=new ArrayList<>();
	void addClient(Client client) {
		clients.add(client);
	}
	List<Client> getClients(){
		return clients;
		
	}
}
