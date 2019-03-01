package com.anr.application;

import java.util.Scanner;

import com.anr.entity.Student;

public class StudentMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Student student[]=new Student[10];
		 try{
			 for(int i=0;i<student.length;i++)
			 {
			student[i]=new Student( s.next(),s.nextInt());
			 }
         
		 } catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
		 }
	}

	
}
