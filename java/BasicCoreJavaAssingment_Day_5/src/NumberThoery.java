import java.util.Scanner;


public class NumberThoery {
	/*public static boolean isPerfect(int num){
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				sum +=i;
		}
		return sum==num;
	}
	public static void printPerfectList(int uperLimit){
		int count=0;
		for(int i=1;i<=uperLimit;i++){
			if(isPerfect(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("Perfect No Found Percentage is  "+((double)count/uperLimit)*100);
	}*/
	
	public static void neitherDeficient(int num)
	{
		int sum=0;
		for(int i=1;i<1000;i++)
		{
			if(num%i==0)
			{
			sum+=i;
			//System.out.println(i);
			}
			else{
				System.out.println(i);
			}
			
			{
				
			}
		}
	}
}


		