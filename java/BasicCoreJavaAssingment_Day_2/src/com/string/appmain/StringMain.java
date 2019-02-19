package com.string.appmain;

import java.util.Scanner;

import com.string.util.StringPalindrome;
import com.string.util.StringReverse;
import com.string.util.TestPalindromicPhrase;

public class StringMain {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter String");
		 String str=scan.next();
		 StringPalindrome.palindrome(str);
		 StringReverse.rev(str);
		 TestPalindromicPhrase.display(str);
	}
}
