
public class Counter {
 
	private int count=0;
	public void increment(){
		synchronized(this){
			count++;
		}}
	
			public int getCount()
			{
				synchronized(this){
				return count;
			}
		}
	public static void main(String[] args) {
		Counter c=new Counter();
		c.getCount();
	}
}
