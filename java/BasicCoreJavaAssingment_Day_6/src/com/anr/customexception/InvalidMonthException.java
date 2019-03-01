package com.anr.customexception;

public class InvalidMonthException {

	public static void getMonth(int month) throws InvalidMonth{
		
		if(month<12)
		{
			System.out.println("valid Month");
		}
		else
		{
			throw new InvalidMonth("Invalid Month");
		}
	}
}
