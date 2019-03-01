package com.anr.customexception;

import com.anr.util.DateUtil;


public class InvalidDate extends Exception {
	public InvalidDate(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public static boolean date(int month,int date,int year)
	{
		if(DateUtil.isLeapYear(year)&& month==2 && date<=29)
			return true;
			else if( month==2 && date<=28)
			return true;
			else if( (month==1|| month==3 ||month==5 ||month==7 ||month==8|| month==10 || month==12)  && date<=31)
				return true;
			else if((month==4||month==6||month==9 ||month==11) && date<=30)
			return true;	
			
			return false;
	}
}
