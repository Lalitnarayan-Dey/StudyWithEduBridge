package synchronization;

 class PrintTable{
	public void print(int n) {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(n*i);
			}
		}
	}
}
 class Thread1 extends Thread{
	 PrintTable printTable;

	public Thread1(PrintTable printTable) {
		this.printTable = printTable;
	}
	
	@Override
	public void run() {
		printTable.print(4);
	}
	 
 }
 class Thread2 extends Thread{
	 PrintTable printTable;

	public Thread2(PrintTable printTable) {
		this.printTable = printTable;
	}
	@Override
	public void run() {
		printTable.print(3);
	}
	 
 }
public class UsingBlock {
	public static void main(String[] args) {
		PrintTable table = new PrintTable();
		Thread1 obj = new Thread1(table);
		
		Thread2 obj2 = new Thread2(table);
		
		obj.start();
		obj2.start();
		
	}

}
