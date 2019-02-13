package AssingmentDay1;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void show()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter The Value");
    	int n=s.nextInt();
    	if(n%2==0){
    		System.out.println("The No Is Even " +n);
    	}
    	else
    	{
    		System.out.println("The no is Odd " +n);
    	}
    }
}
