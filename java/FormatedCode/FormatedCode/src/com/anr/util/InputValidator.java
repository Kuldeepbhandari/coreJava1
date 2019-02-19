package com.anr.util;

public abstract class InputValidator {

	public static boolean isNumber(String str){
		return str.matches("[0-9]+");
	}
	public static boolean isBinary(String str){
		return str.matches("[0-1]+");
	}
	public static boolean isCharacter(String str){
		return str.toLowerCase().matches("[a-z]+");
	}
}
