
public class StringSum {
	public static void sum(String args[])
	{
		int n;
		int a=0;
		int sum=0;
		 
				n=Integer.parseInt(args[0]);
		 
		while(n!=0)
		{
		a=n%10;
		n=n/10;
		sum=sum+a;
		}
		System.out.println("Sum of digits: =" +a+" + " + ++a +" + "+ ++a +" + " + ++a +" + " + ++a + "  = " + sum);
	
		
	}

}
