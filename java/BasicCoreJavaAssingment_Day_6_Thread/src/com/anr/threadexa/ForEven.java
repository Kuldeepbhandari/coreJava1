package com.anr.threadexa;

public class ForEven implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			try {
				Thread.sleep(1000);
				Even();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

	private void Even() {
		for(int i=1;i<10;i++){
			if(i%2==0){
				System.out.println("The even no is " +i);
			}
		}		
	}

}
