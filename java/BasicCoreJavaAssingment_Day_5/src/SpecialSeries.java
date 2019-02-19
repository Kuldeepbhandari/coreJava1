
public class SpecialSeries {
 
	public static void getSeries(int numTerms,double x)
	{
		double sum=0;
		for(int i=1;i<=numTerms;i++)
		{
			sum=Math.pow(x, 2*i-1)/2*i;
			for(int j=2*i-1;j>0;j=j-2)
			{
				
			}
		
		}
		System.out.println(sum);
	}
}
