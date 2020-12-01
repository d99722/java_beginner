package lec9;

public class BankAccount implements Record {

	private int balance;
	private Key key;
	
	public BankAccount(int initial_amount, Key id) {
		balance = initial_amount;
		key = id;
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	public boolean withdraw(int amount) {
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		else
			return false;
	}
	
	public int getBalance() {
		return balance;
	}
	
	@Override
	public Key getKey() {
		return key;
	}

}
