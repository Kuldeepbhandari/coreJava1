import java.util.Scanner;


public class PrintPatternC {
	public static void pattern() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value in odd no");
		int num=s.nextInt();
		if(num%2==1)
		{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(i==1 || i==num || i==(num/2)+1 || j==1 || j==num || j==(num/2)+1)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
	}
		}
		else
		{
			System.out.println("Plz Input value in Odd no");
		}
}
}