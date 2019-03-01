package com.anr.util;

public interface DateUtil {

	public static boolean isLeapYear(int year){
		return (year %4==0  && year %100!=0 || year %400==0);	
		}
			public static String day(int day)
			{
				switch(day)
				{
				case 0:
				return "Monday";
				case 1:
					return "Tuesday";
				case 2:
					return "Wensday";
				case 3:
					return "Thursday";
				case 4:
					return "Friday";
				case 5:
					return "Saturday";
				case 6:
					return "Sunday";		
				}
				return null;
			}
			public static boolean getYear(int year){
				return (year>=1 && year<=1999);
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
			//for check validdate
		public static boolean isValidDate(int year, int month, int day){
			if(DateUtil.isLeapYear(year)&& month==2 && day<=29)
			return true;
			else if( month==2 && day<=28)
			return true;
			else if( (month==1|| month==3 ||month==5 ||month==7 ||month==8|| month==10 || month==12)  && day<=31)
				return true;
			else if((month==4||month==6||month==9 ||month==11) && day<=30)
			return true;	
			
			return false;
		}
		//for check valid getCentury
		public static int  getCentury(int year){
			int c=year%400;
			if(c>=100 && c<200)
				return 4;
			if(c>=200 && c<300)
				return 2;
			if(c>=300 && c<400)
				return 0;
			if (c>=0 && c<100 )
				return 6;
			return -123;
		}
		//for check get Month
		public static int getMonth(int month, int year){
	     switch(month){
	     case 1:
	    	 if(isLeapYear(year))
	    		 return 6;
	    	 else
	    		 return 0;
	     
	     case 2:
	    	 if(isLeapYear(year))
	    		 return 2;
	    	 else
	    		 return 3;
	     case 3:
	    	 if(isLeapYear(year))
	    		 return 3;
	     case 4:
	    	 if(isLeapYear(year))
	    		 return 6;
	     case 5:
	    	 if(isLeapYear(year))
	    		 return 1;
	     case 6: 
	    	 if(isLeapYear(year))
	    		 return 4;
	     case 7:
	    	 if(isLeapYear(year))
	    		 return 6;
	     case 8:
	    	 if(isLeapYear(year))
	    		 return 2;
	     case 9:
	    	 if(isLeapYear(year))
	    		 return 5;
	     case 10:
	    	 if(isLeapYear(year))
	    		 return 0;
	     case 11:
	    	 if(isLeapYear(year))
	    		 return 3;
	     case 12:
	     if(isLeapYear(year))
	    	 return 5;
			
			return -1;
		}
	     return year;
		}
		public static String getDayOfWeek(int year ,int month,int day)
		{
			if(DateUtil.isValidDate(year, month, day)){
			
				int  a=(DateUtil.getCentury(year) + year%100 + year%100 /4 + (DateUtil.getMonth(month, year))%7);
		}
			return null;
		
	}
}
