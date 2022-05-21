package abstractionn.hw.question02;

public class BankC extends Bank{
	double depositeBalance;
//	For Deposit the balance in Bank - C
	BankC(double depositeBalance){
		this.depositeBalance = depositeBalance;
	}
	@Override
		public void getBalance() {
		
		System.out.println("Balance in Bank-C : "+depositeBalance+" $");
	}

}
