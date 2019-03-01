package com.anr.customexception;

public class InvalidDateException  {
 
	public static void validDate(int month,int date,int year) throws InvalidDate{
		
		if(!InvalidDate.date(month, date, year)){
			throw new InvalidDate("Invalid Date");
		}
		else{
			System.out.println("Date is Valid");
		}
	}
}
