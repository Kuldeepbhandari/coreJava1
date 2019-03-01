package com.anr.threadexa;

public class CheckLongLasting implements Runnable {

	Thread arr[]=new Thread[5];
	@Override
	public void run() {
		// TODO Auto-generated method stub
		checkAlive();
		System.out.println(Thread.currentThread().getName());
	}

	private void checkAlive() {
		for(int i=0;i<arr.length;i++){
			synchronized (this) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().isAlive());
				//System.out.println(arr[i]);
				break;
			}
//if(Thread.currentThread().isAlive() && arr[i].isAlive() || Thread.currentThread().isAlive()&& arr[i+1].isAlive())
			//{
				
			//}
		}
		
	}

}
