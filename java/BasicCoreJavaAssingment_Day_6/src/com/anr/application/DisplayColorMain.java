package com.anr.application;

import com.anr.customexception.NotMatch;
import com.anr.entity.DisplayColor;


public class DisplayColorMain {
	public static void display(char c) throws NotMatch
	{
		if(DisplayColor.getColor(c))
		{
			System.out.println("Color is  match");
		}
		else
		{
			throw new NotMatch("color is not matched"); 
			
		}
	}
	public static void main(String[] args) throws NotMatch {
		DisplayColorMain.display('q');
		
	}
}
