package com.anr.application;

import java.util.Scanner;

import com.anr.util.InputValidator;

public class StuApplication {
	static Scanner scan=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter number");
	int num=getNumber();
	System.out.println(num);
}
private static int getNumber(){
	String str=scan.nextLine();
	if(!InputValidator.isNumber(str))
		return getNumber();
	return Integer.parseInt(str);
}
}
