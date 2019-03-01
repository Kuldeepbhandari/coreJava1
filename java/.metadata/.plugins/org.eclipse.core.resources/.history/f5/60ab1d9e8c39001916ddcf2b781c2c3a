import com.anr.threadexa.CheckLongLasting;


public class CheckLongLastingMain {
public static void main(String[] args) {
	Runnable run=new CheckLongLasting();
	Thread t=new Thread(run);
	Thread t1=new Thread(run);
	Thread t2=new Thread(run);
	Thread t3=new Thread(run);
	Thread t4=new Thread(run);
	t.setPriority(Thread.MAX_PRIORITY);
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	t3.setPriority(Thread.MIN_PRIORITY);
	t4.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t.start();
	t2.start();
	t3.start();
	t4.start();
}
}
