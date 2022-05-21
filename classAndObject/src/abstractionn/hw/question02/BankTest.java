package abstractionn.hw.question02;

public class BankTest {
	public static void main(String[] args) {
		
		BankA bankA = new BankA(100);
		bankA.getBalance();
		
		BankB bankB = new BankB(150);
		bankB.getBalance();
		
		BankC bankC = new BankC(200);
		bankC.getBalance();
	}

}
