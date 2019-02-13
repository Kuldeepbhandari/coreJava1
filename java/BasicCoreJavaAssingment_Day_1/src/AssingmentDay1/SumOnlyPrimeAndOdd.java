package AssingmentDay1;

import java.text.DecimalFormat;

public class SumOnlyPrimeAndOdd {
 public static void show()
 {    int sum=0;
 
 double count=0;
 
 double evenAvg=0;
 
 DecimalFormat df=new DecimalFormat("00.0000");
	 for(int i=1;i<1000;i++) {
		 if(i%2==0&& i%2==1){
			 sum+=i;
			 count++;
		 } 
	 }
	 System.out.println("The sum of Even No is"+sum);
	 evenAvg=(double)sum/count;
	System.out.println(evenAvg);
}
}
