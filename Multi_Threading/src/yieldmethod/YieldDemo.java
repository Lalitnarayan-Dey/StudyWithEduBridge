package yieldmethod;

public class YieldDemo implements Runnable {
	Thread t;
	
	public YieldDemo(String str) {
		t = new Thread(this, str);
		t.start();
	}
	public static void main(String[] args) {
		new YieldDemo("Thread1");
		new YieldDemo("Thread2");
		new YieldDemo("Thread3");

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			if(i%5 == 0) {
				System.out.println(Thread.currentThread().getName()+"Yielding control");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+" hsa finished execution");
	}
}
