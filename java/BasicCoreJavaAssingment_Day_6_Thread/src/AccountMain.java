import java.util.Scanner;

import com.anr.entity.Account;


public class AccountMain  {
static Scanner s =new Scanner(System.in);
int amount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The amount");
		int amount=s.nextInt();
		Runnable run=new Account(amount);
		//Runnable run=new Account(amount,depositAmount);
		Thread t=new Thread(run);
		t.start();
	}
}
