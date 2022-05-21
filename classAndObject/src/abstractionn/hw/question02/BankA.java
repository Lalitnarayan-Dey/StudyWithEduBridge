package abstractionn.hw.question02;

public class BankA extends Bank{
	double depositeBalance;
//	For Deposit the balance in Bank - A
	BankA(double depositeBalance){
		this.depositeBalance = depositeBalance;
	}
	@Override
		public void getBalance() {
		
		System.out.println("Balance in Bank-A : "+depositeBalance+" $");
	}
}
