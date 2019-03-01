package com.anr.entity;

import com.anr.customexception.InvalidDate;

public class MyDate extends Exception  {
 
	private int date;
	private int month;
	private int year;
	
	public MyDate(int month, int date, int year) throws InvalidDate{
		if(!InvalidDate.date(month, date, year) ){
			throw new InvalidDate("Invalid Date");
		}
		else{
			System.out.println("Date is Valid");
		}
		this.month = month;
		this.date = date;
		this.year = year;
	}
	public MyDate() {
		 
	}
	public int getdate() {
		return date;
	}
	public void setdate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate [month=" + month + ", date=" + date + ", year=" + year
				+ "]";
	}
	
}
