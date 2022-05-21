package abstractionn.hw.question02;

public class BankB extends Bank{
	double depositeBalance;
//	For Deposit the balance in Bank - B
	BankB(double depositeBalance){
		this.depositeBalance = depositeBalance;
	}
	@Override
		public void getBalance() {
		
		System.out.println("Balance in Bank-B : "+depositeBalance+" $");
	}

}
