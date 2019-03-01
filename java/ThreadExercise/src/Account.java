
public class Account {

	private double balance=0;

	public Account(double balance) {
		
		this.balance = balance;
	}
	
	public synchronized void deposit(double amount)
	{
		if(amount<0){
			throw new IllegalArgumentException("can't deposit");
		}
		this.balance+=amount;
		System.out.println("deposit "+amount+ "in thread"+Thread.currentThread().getId()+"get balance"+balance);
	}
	public synchronized void withdraw(double amount){
		if (amount < 0 || amount > this.balance)
		{   throw new IllegalArgumentException("can't withdraw");
		}  this.balance -= amount; 
		System.out.println("withdraw"+amount+"in thread"    + Thread.currentThread().getId()    + " balance is "+balance); 
	}
}
