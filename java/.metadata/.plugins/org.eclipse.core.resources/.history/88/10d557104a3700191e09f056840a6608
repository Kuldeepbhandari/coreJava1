import java.util.Scanner;


public   class MyThreadMain {
/*static Scanner s=new Scanner(System.in); 
public static String getNam(){
	return s.next();
}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("ENter name");
		//MyThreadMain m=new MyThreadMain();
		
		MyThread t=new MyThread();
			MyThread t1=new MyThread();
			MyThread t2=new MyThread();
			t1.setName("batman");
			t1.setPriority(Thread.MAX_PRIORITY);
			
			System.out.println(t1.getName());
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t1.isAlive());
			t2.start();
			//t.yield();
			
			
	}

}
