import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReverseArrayMethod {
public static void reverseArray() throws FileNotFoundException
{
	int []intArr =new int[15];
	File f=new File ("in.txt");
	Scanner s=new Scanner(f);
	int intArr1[]=new int[s.nextInt()];
	int index=0;
	while(s.hasNextInt()){
		intArr[index]=Integer.parseInt(s.next());
		index++;;
	}
	for(int i=0;i<intArr.length;i++){
		int temp=0;
		for(int j=i+1;j<intArr.length;j++){
			if(intArr[i]>intArr[j])
			{
		temp=intArr[i];
		intArr[i]=intArr[j];
		intArr[j]=temp;
				}
		}
		
	}
	for(int l=0;l<intArr.length;l++)
	{
System.out.println(intArr[l]);
	}
	
	
	
}
}
