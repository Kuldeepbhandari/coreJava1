package com.getfabonacci.util;

import java.util.Scanner;

public class GetFabonacci {
public static int getFab(int num)
{
	int j=46;
	int n1=0;
	int n2=1;
	int sum=0;
	for(int i=1;i<=j;i++){  
		sum=n1+n2;
		n1=n2;
		n2=sum;	
	}
	return n2;
}
}
