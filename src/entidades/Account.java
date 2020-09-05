package entidades;

public class Account {
	private int accountNumber;
	private String holder;
	private double balance;

	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		setHolder(holder);
		deposit(initialDeposit);
	}

	public void withdraw(double withdrawValue) {
		this.balance -= withdrawValue + 5.00;
	}

	public void deposit(double depositValue) {
		this.balance += depositValue;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return String.format("====Account Data====%n Account: %d, Holder: %s, Balance: %.2f", getAccountNumber(), getHolder(),
				getBalance());
	}
}
