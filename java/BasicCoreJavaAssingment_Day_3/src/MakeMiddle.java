import java.util.Scanner;


public class MakeMiddle {
public static void makeMiddle(){
	int mid=0;
	int[]grades;
	Scanner s=new Scanner(System.in);
	  System.out.println("Enter The Arry Length");
	  int[] len=new int[s.nextInt()];
	  int size=len.length;
	System.out.println("Enter the Array elements");
	  grades=new int[len.length];
	  
	for(int i=0;i<len.length;i++){
		grades[i]=s.nextInt();
	}
	if(size>=2 && size%2==0){
		mid=len.length/2;
		len[0]=grades[mid-1];
		len[1]=grades[mid];
		
	}
	else{
		System.out.println("Plz enter size in even");
	}
	System.out.println(len[0]+" "+len[1]);
	}
public static void main(String args[]){
	MakeMiddle.makeMiddle();
	}
	
}
