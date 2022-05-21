package synchronization;

public class AccountSynchro {
	private float balance = 7000;
	
	public float getBalance() {
		return balance;
	}
	public void withdraw(float amount) {
		balance = balance-amount;
	}

}
