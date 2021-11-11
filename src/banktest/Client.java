package banktest;

import java.util.List;

public class Client {
	private String name;
	List<Account> accounts;
	Client(String name){
		this.name=name;
	}
	void addAccount(Account account) {
		
	}
	List<Account> getAccounts(){
		return accounts;
		
	}
	@Override
	public String toString() {
		return "Client [name=" + name + "]";
	}
	
}
