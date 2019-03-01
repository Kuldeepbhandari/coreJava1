package com.anr.threadexa;

public class ForOdd  implements Runnable{

	@Override
	public void run() {
		try{
			synchronized (this) {
				Thread.sleep(2000);
				Odd();	
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}		
	}

	private void Odd() {
		for(int i=1;i<10;i++){
			if(i%2==1){
				System.out.println("The odd no is "+i);
			}
		}	
	}
}
