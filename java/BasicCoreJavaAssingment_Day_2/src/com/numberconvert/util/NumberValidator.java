package com.numberconvert.util;

public  abstract class NumberValidator {
 public static boolean isNumber(String bin){
	return bin.matches("[0-1 ]+");
	 
 }
}
