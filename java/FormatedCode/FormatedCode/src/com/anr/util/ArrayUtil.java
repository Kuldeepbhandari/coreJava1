package com.anr.util;

public abstract class ArrayUtil {
public static void reverseArray(int array[]){
	for(int i=0;i<array.length/2;i++){
		int temp=array[i];
		array[i]=array[array.length-1-i];
		array[array.length-1-i]=temp;
	}
}
public static int findMax(int array[]){
	return 0;
}
}
