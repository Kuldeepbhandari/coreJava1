package com.anr.threadexa;

public class ThreadSynchronization  implements Runnable{
int count=0;
	public void IncerementCount()
	{
		count++;
		System.out.println(Thread.currentThread().getName()+"count= "+count);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			synchronized (this){
			Thread.sleep(1000);
				IncerementCount();
			}	
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}


}
