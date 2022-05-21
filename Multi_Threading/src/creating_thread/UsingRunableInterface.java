package creating_thread;

public class UsingRunableInterface  implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Currently running . "+Thread.currentThread().getName());
		}
		
	}
	public static void main(String[] args) {
		Runnable runableThread = new UsingRunableInterface();
		Thread thread = new Thread(runableThread);
		thread.setName("1st Thread.");
		thread.start();
		
		Thread thread2 = new Thread(runableThread);
		
		thread2.setName("2nd Thread.");
		thread2.start();
	}
}
