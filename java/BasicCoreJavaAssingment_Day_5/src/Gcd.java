
public class Gcd {

	public static int gcd(int a,int b)
	{
		int temp=0;
		while(b!=0)
		{
			if(b==0)
			{
				return 0;
			}
			if(a>b)
			temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
}
