package com.anr.customexception;

public class InvalidMonth extends Exception {
	
	public InvalidMonth(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public static String month(int mon)
		{
			switch(mon){
			case 1:
				return "jan";
			case 2:
				return "Feb";
			case 3:
				return "Mar";
			case 4:
				return "Apr";
			case 5:
				return "May";
			case 6:
				return "june";
			case 7:
				return "jul";
			case 8:
				return "Aug";
			case 9:
				return "Sep";
			case 10:
				return "Oct";
			case 11:
				return "Nov";
				case 12:
					return "Dec";
			}
			return null;
	}
}
