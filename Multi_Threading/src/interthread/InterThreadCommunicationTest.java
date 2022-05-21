package interthread;

import javax.xml.stream.events.StartDocument;

public class InterThreadCommunicationTest extends Thread {
public static void main(String[] args) {
	BankCustomer customer = new BankCustomer();
	
	//Inner class method used
//	Use for explicitly create thread  if we are not extends the thread class or
//	not implementing Runnable interface
	new Thread() {
		@Override
			public void run() {
				customer.withdraw(10000);
			}
	}.start();
	
	new Thread() {
		@Override
			public void run() {
				customer.deposite(10000);
			}
	}.start();
	
}
}
