package banktest;

public class Account {
	int id;
	double balance;
	Account (int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	double getBalance() {
		return balance;
	}
	void deposit(double amount) {
		balance+=amount;
	}
	void withdraw(double amount) {
		if (amount<=balance)
			balance-=amount;
	}
}
