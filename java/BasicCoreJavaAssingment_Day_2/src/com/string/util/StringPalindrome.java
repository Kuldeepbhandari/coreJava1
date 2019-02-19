package com.string.util;

public class StringPalindrome {

	public  static void palindrome(String str)
	{
		StringBuilder rev=new StringBuilder();
		 for(int i=str.length()-1;i>=0;i--){
			 rev.append(str.charAt(i)); 
		 }
		 if(str.contentEquals(rev)){
			 System.out.println("String is palindrome " );
		 }
		 else{
			 System.out.println("String is not palindrome");
		 }
		 System.out.println("The Reverse String is "+rev);
	}
}
