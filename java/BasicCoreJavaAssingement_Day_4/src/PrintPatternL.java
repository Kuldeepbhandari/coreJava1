import java.util.Scanner;


public class PrintPatternL {
public static void Pattern()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Value");
	int num=s.nextInt();
	
	for(int i=0;i<=num;i++)
	{
		for(int j=num;j>0;i--)
		{ if((i+j)<=num)
			System.out.print(j+"\t");
		else
			System.out.print("\t");
		}
		
		/*{if((i+k)<=num+1)
		{
			System.out.print(k+"\t");
		}
		else
		{
			System.out.print("\t");
		}
		}*/
			
			
			System.out.println("");
		}
		
	
	}
}

