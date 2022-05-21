package creating_thread;

public class ThreadClass extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Currently executing. . ."+getName());
		}
	}

	public static void main(String[] args) {
		Thread thread = new ThreadClass();
		thread.setName("1st Thread");
		thread.start();
		System.out.println();
		
		Thread thread2 = new ThreadClass();
		thread2.setName("2nd Thread");
		thread2.start();
		
//		System.out.println();
	}

}
