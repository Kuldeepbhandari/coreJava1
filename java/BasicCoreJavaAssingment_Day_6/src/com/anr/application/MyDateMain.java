package com.anr.application;

import com.anr.entity.MyDate;

public class MyDateMain {
public static void main(String[] args) throws Exception {
	String month[]=args[0].split("/");
	System.out.println(month[0]+"------"+month[1]+"---------"+month[2]);
	
	//InvalidDateException.validDate(3, 40, 0000); // format mm//dd//yyyy
	//InvalidDateException.validDate(2, 4, 1996);
	//MyDateMain md=new MyDateMain();
	
  MyDate m=new MyDate(Integer.parseInt(month[0]),Integer.parseInt(month[1]),Integer.parseInt(month[2]));
  
 System.out.println(m);
}
}