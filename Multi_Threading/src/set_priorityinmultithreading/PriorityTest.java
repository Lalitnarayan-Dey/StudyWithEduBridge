package set_priorityinmultithreading;

public class PriorityTest extends Thread{
	@Override
	public void run() {
		System.out.println("Name of the thread = "+getName()+"  Priority = "+getPriority());
	}
	public static void main(String[] args) {
		PriorityTest thread  =  new PriorityTest();
		thread.setName("Thread-1");
		thread.setPriority(MIN_PRIORITY);
		thread.start();
		
		PriorityTest thread2 = new PriorityTest();
		thread2.setName("Thread-2");
		thread2.setPriority(MAX_PRIORITY);
		thread2.start();
		
	}

}
