package entities;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	
	
	
	
	public Account(Integer number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Account(Integer number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}


	public void deposit(double amount) {
		this.balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		this.balance = balance - amount - 5.00;
	}
	
	public String toString() {
		return "Account "+number+", Holder: "+holder+", Balance: $"+String.format("%.2f",balance);
	}
	
}
