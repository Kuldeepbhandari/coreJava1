package com.getfabonacci.util;

import java.util.Scanner;

public class FibonacciOverflow {
public static void overFlow(int num)
{
	for(int i=1;i<=num;i++){
	if(GetFabonacci.getFab(i))
	{
		System.out.println(i);
	}
	}
}
public static void main(String[] args) {
	FibonacciOverflow.overFlow(45);
}
}
