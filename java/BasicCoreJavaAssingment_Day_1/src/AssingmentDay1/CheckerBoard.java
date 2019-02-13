package AssingmentDay1;

public class CheckerBoard {
  public static void show()
  {
	  int size=7;
	  for(int i=0;i<=size;i++) {
		  if(i%2!=0)
			  System.out.print(" ");
		  for(int j=1;j<size;j++) {
			System.out.print((i+j)%2+" ");
		  }
		  System.out.println("");
	  }
  }
}
