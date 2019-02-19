import java.util.Scanner;


public class StringOpeartion {
	static String rev="";
	public static String show()
	{
	  Scanner s=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=s.next();
	return str;
	}
	/*public static void rev(String str){
	
		//int len=str.length();
		for(int i=str.length()-1;i>0;i--){
			 rev+=str.charAt(i);
		}
		System.out.println("The Reverse string is "+rev);
	}
	public static void palindrome(String str)
	{
		for(int i=str.length()-1;i>0;i--)
		{
			rev+=str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println("String is palidrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}*/
							//USing StringBuilder
	public static void builder(String str)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>0;i--)
		{
			sb.append(str.charAt(i));
			char c[]=str.toCharArray();
			System.out.println(c);
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		 String s=StringOpeartion.show();
		//StringOpeartion.palindrome("str");
		StringOpeartion.builder(s);
	}
}
