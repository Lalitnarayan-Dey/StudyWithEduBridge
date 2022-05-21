package set_priorityinmultithreading;

public class JoinExample extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		JoinExample thread1 = new JoinExample();
		JoinExample thread2 = new JoinExample();
		JoinExample thread3 = new JoinExample();

		thread1.start();
		try {
			thread1.join();   //first thread execute till the last element
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();  //After completing execution of 1st thread, thread2 & 3 will execute. 
		thread3.start();

	}
}
