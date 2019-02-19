import java.util.Scanner;


public class PrintPatternG {
public static void pattern()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Value");
	int num=s.nextInt();
	for(int i=1;i<=num;i++)
	{ int mid=num/2;
		for(int j=1;j<=num;j++)
		{
			if( i==num|| i==1 ||i==mid+1  )
			{
				System.out.print("#");
			}
			for(int k=i;k<=i;k++)
			{
				if((i==2&& j>=5&& j<=7)){
					System.out.print("#");
				}
					else{
						System.out.print(" ");
				}
			}
			/*else if(( i<=mid &&j<=2*i-1 ))
			{
				System.out.print("#");
			}
			{
				System.out.print(" ");
			}*/
		}
		System.out.println(" ");
	}
	
}
}
