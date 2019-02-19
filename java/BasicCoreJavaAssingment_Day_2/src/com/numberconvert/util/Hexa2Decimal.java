package com.numberconvert.util;



import java.util.Scanner;

public class Hexa2Decimal {
	public static int getNumericValue(char ch)
	{
		switch(ch)
		{
	case 'a':
	return 10;
	case 'b':
	return 11;
	case 'c':
	return 12;
	case 'd':
	return 13;
	case 'e':
	return 14;
	case 'f':
	return 15;
	default :
		return ch-'0';
		}
	}
	public static void display( String bin) {
		
		int sum=0;
		//int k=0;
		for(int i=bin.length()-1; i>=0;i--){
			sum+=Math.pow(16,i)*(Hexa2Decimal.getNumericValue(bin.charAt(bin.length()-i-1)));
		}
		System.out.println(sum);
	}
}
