import java.util.Scanner;


public class PrintPatternE {
public static void pattern() {
	// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter A Value");
	int num=s.nextInt();
	for(int i=0;i<num;i++)
	{
		for(int j=0;j<num;j++)
		{
       if((i==0 || j==0||j==num )||(i==j )|| j==num-1 ||i==num-1||i+j==num-1)
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
}