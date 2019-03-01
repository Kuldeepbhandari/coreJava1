import java.util.Scanner;

import com.anr.util.MathUtil;


public class NumberThoeryMain {
	
	public static void printPerfectList(int uperLimit){
		int count=0;
		for(int i=1;i<=uperLimit;i++){
			if(MathUtil.isPerfect(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("Perfect No Found Percentage is  "+((double)count/uperLimit)*100);
	}
	public static void printDeficientNo(int uperLimit)
	   {
		   int countDeficientNumbers = 0;
	       for (int i = 1; i <= uperLimit; i++) {
	           if ( MathUtil.isDeficient(i) || MathUtil.isPerfect(i)) {
	               continue;
	           }
	           System.out.print( i+" ");
	           countDeficientNumbers++;
	       }
	       System.out.println("The Total Deficient No is " +((double)countDeficientNumbers/uperLimit)*100);
	   }

	
	public static void main(String[] args) {
		NumberThoeryMain.printPerfectList(1000);
		NumberThoeryMain.printDeficientNo(10000);
		
	}
}


		