import java.util.Scanner;


public class PascalTriangle2 {
public static void pattern()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Value");
	int num=s.nextInt();
	for(int i=0;i<num;i++)
	{
		for(int j=num-1;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=i;j++)
		{
			System.out.print((int)Math.pow(11, j));
		}
		System.out.println("");
	}
}
}
