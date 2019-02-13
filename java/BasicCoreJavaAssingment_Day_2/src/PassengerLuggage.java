import java.util.Scanner;


public class PassengerLuggage {
public static void show()
{
	double linearDimensions=0 ;
	double checkedLuggage=20;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length in cm");
	double length=s.nextDouble();
	System.out.println("Enter the width in cm");
	double width=s.nextDouble();
	System.out.println("Enter the Height in cm");
	double height=s.nextDouble();
	System.out.println("Enter the Weight in kg");
	double weight=s.nextDouble();
	System.out.println("Enter Maximum  Weight of carry on luggage");
	double mwcol=s.nextDouble();
	System.out.println("Maximum weight of checked luggage");
	double mwcl=s.nextDouble();
	linearDimensions=(length+height+width);
	if(linearDimensions<=115&&checkedLuggage<=20&&weight<=8&&mwcl<=20)
	{
		System.out.println("Checked bag acceptable");
	}
	
	else{
		System.out.println("Carry on too heavy");
	}
	

}
}
