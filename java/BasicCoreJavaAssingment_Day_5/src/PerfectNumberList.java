import java.util.Scanner;


public class PerfectNumberList {

	public static void perfect()
	{
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter The no");
		int num=s.nextInt();*/
		int upparBound=1000;
		int num1=0;
		int num2 = 0;
		int count=0;
		for(int i=1;i<upparBound;i++)
		{
			if(upparBound%i==0)
			{
				num1=i;
				num2+=num1;
				System.out.println(num1);
			}
			/*if(num2==num)
			{
				System.out.println("The List of no is "+num1);
			}*/
		}
		
		
	}
}