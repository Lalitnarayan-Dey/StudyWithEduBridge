package interthread;

public class BankCustomer {
	int amount = 10000;
	
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" is going to withdraw.");
		if(this.amount < amount) {
			System.out.println("Less balance. \nWaiting for deposite. . . ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			this.amount -=amount;
			System.out.println(Thread.currentThread().getName()+" completes the withdaw.Available balance : "+this.amount);
		
	}
	public synchronized void deposite(int amount) {
		System.out.println(Thread.currentThread().getName()+" is going to deposite.");
		this.amount +=amount;
		System.out.println(Thread.currentThread().getName()+" completes deposite. Available balance : "+this.amount);
	    notify();
	}
}
