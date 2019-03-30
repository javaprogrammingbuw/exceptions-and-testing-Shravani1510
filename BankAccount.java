import java.util.Random;

public class BankAccount {
	final String bic = "ABCDEFXXX";
	String iban ="DE00123456780000000000" ;
	int securityNumber;
	private Person owner;
	double limit;
	double balance;
	
	public BankAccount(Person owner, double balance, double limit) {
		this.balance=balance;
		this.limit =limit;
		this.owner = owner;
		iban = iban.substring(0, 13);
		for(int i=0; i<10; i++) {
			iban += new Random().nextInt(10);
		}
		String temp ="";
		for(int i=0; i<6; i++) {
			
			temp += new Random().nextInt(10);
			int n = Integer.parseInt(temp);
			securityNumber = n;
		}
	}



	public BankAccount(Person owner, double balance) {
		this.balance=balance;
		iban = iban.substring(0, 13);
		this.owner = owner;
		for(int i=0; i<10; i++) {
			iban += new Random().nextInt(10);
		}
		String temp ="";
		for(int i=0; i<6; i++) {
			
			temp += new Random().nextInt(10);
			int n = Integer.parseInt(temp);
			securityNumber = n;
		}
		limit =0.0;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getIban() {
		return iban;
	}
	
	public int getSecurityNumber() {
		return securityNumber;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public double getLimit() {
		return limit;
	}
	
	public boolean deposit(double amount, int securityNumber) {
		if(securityNumber== this.securityNumber) {
				amount = balance+amount;
			return true;
		}
		return false;
	}
	
	public  double withdraw(double amount, int securityNumber) {
		if(securityNumber== this.securityNumber) {
			if(limit == (balance-amount)) {
				amount =balance-amount;
			}
		}
		return amount;
	}
	
	public double setBalance(double balance) {
		return this.balance =balance;
	}
	
	public double transfer(BankAccount remote, double amount, int securityNumber) {
		if(securityNumber== this.securityNumber && amount <=balance + limit) {
			remote.setBalance(remote.getBalance()+amount);
			return setBalance(balance-amount);
		}
		else {
			System.out.println(" entered amount is out of limit");
		}
		return 0.0;
	}
	
	
	
}
