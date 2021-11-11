package banktest;

public class BankApplication {

	public static void main(String[] args) {
		Client c1=new Client("Cosmin");
		Client c2=new Client("Veronica");
		Client c3=new Client("Adi");
//		System.out.println(c.name);
		Bank b=new Bank();
		b.addClient(c1);
		b.addClient(c2);
		b.addClient(c3);
		System.out.println(b.getClients());
	}

}
