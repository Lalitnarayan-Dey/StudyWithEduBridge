package yieldmethod;

import java.util.Iterator;

public class SecondExYieldMethod extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
	public static void main(String[] args) {
		SecondExYieldMethod t1 = new SecondExYieldMethod();
		SecondExYieldMethod t2 = new SecondExYieldMethod();
		
		t1.setName("Thread-1");
		t1.setName("Thread-2");
		
		for(int i=1;i<3;i++) {
			t1.yield();
			System.out.println(Thread.currentThread().getName()+" in control");
		}
		
	}

}
