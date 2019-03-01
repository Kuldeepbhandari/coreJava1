
public class InternetBankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac=new Account(10);
		new Thread(new DepositThread(ac,50)).start();
		/*new Thread().start();
		new Thread(new WithdrawThread(ac,50)).start();*/
		
		
	}

}
