package synchronization;

public class AccountDanger implements Runnable {
	private AccountSynchro account = new AccountSynchro();
	public static void main(String[] args) {
		AccountDanger dangerAccount = new AccountDanger();
		Thread thread1 = new Thread(dangerAccount);
		Thread thread2 = new Thread(dangerAccount);
		
		thread1.setName(" X ");
		thread2.setName(" Y ");
		thread1.start();
		thread2.start();
	}
	@Override
	public void run() {
	
		for(int i=1;i<=5;i++) {
			makeWithraw(1000);
		}
	}
	public synchronized void makeWithraw(int amount) {
		if(account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdaw.");
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" complete withdraw. Available balance : "+account.getBalance());
			System.out.println();
		}
		else {
			System.out.println("Low balance for "+Thread.currentThread().getName());
		}
		
	}

}
