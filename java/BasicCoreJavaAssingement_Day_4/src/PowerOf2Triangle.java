import java.util.Scanner;


public class PowerOf2Triangle {

	public static void pattern()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Value");
		int num=s.nextInt();
		for(int i=0;i<num;i++)
		{for(int k=num;k>i;k--)
		{
			System.out.print(" ");
		}
			for(int j=0;j<=i;j++)
			{
				System.out.print((int)Math.pow(2, j)+" ");
			}
			/*for(int k=num;k>=i;k--)
			{
				System.out.print(" ");
			}*/
			/*for(int l=0;l<i;l++)
			{
				System.out.print((int)Math.pow(2, i));
			}*/
			
			System.out.println(" ");
		}
	}
}
