package com.anr.entity;

public class DisplayColor {

	public static boolean getColor(char c){
		switch(c){
		case 'v':
			System.out.println("Color is vilot");
			break;
		case 'i':
			System.out.println("color is indigo");
			break;
		case 'g':
			System.out.println("Color is green");
			break;
		case 'y':
			System.out.println("Color is yellow");
			break;
		case 'r':
			System.out.println("color is red");
			break;
		case 'b':
			System.out.println("color is blue");
			break;
		case 'o':
			System.out.println("color is orange");
		default:
			return false;
	}
		return true;}
}
