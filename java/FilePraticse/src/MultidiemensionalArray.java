import java.util.Scanner;


public class MultidiemensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len=s.nextInt();
		System.out.println("Enter the name");
		String str=s.next();
		StringBuffer sb=new StringBuffer();
		String arr[]=new String[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.next();
			sb.append(arr[i]).append(" ");
		}
		System.out.println("\n");
		System.out.println(sb);
		
		
		
	}

}
