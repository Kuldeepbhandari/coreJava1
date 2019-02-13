import java.util.Scanner;


public class UserGuess {

  
  static int max=10;
  
  public static void show()
  {
	  String  secretCode="53560";
	  //54568
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String num=s.next();
	  int sum=0;
		StringBuffer index=new StringBuffer();
		StringBuffer numbers=new StringBuffer();
		
	  for(int i=0;i<num.length();i++){
		  if((secretCode.charAt(i)+"").equals(num.charAt(i)+"")){
			  index.append(i+" ");
			  sum+=Integer.parseInt(num.charAt(i)+"");
			  
		  }
		 /* else ()
		  {
			  //UserGuess.show();
		  }*/
		  
	  }
	  System.out.println(" Index with match digits"+index.toString()+" sum of digits = "+sum);
  }
  }

