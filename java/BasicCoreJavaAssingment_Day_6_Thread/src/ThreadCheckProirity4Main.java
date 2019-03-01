import com.anr.threadexa.ThreadCheckPriority4;


public class ThreadCheckProirity4Main {	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable=new ThreadCheckPriority4();
		//Thread t=new Thread(runnable,"HighPriority");
		Thread t1=new Thread(runnable,"HighPriority");
		Thread t2=new Thread(runnable,"LowPriority");
	Thread t3=new Thread(runnable,"low");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		if(t1.getPriority()>t2.getPriority()){
			t1.start();
			System.out.println(t1.getPriority());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t2.start();
			t3.start();	
		}
		}
		}
	

