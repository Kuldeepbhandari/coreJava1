package com.anr.util;

import java.io.IOException;
import java.util.Scanner;

import com.anr.entity.Student;

public class StudentUtil {
static Scanner s=new Scanner(System.in);
public  Student[] stuDetails() throws IOException
{
	String data=ReadContent.readContent("student.csv");
	String []str=data.split("\n");
	Student student[]=new Student[str.length];
	for(int k=1;k<str.length;k++)
	{
		String str1[]=str[k].split(",");
		int i=0;
		student[k]=new Student(Integer.parseInt(str1[i]),str1[++i],str1[++i],str1[++i]);
	}
	return student;
}
	public static Student[] sort(Student student[])
	{
		for(int i=1;i<student.length;i++){	
			for(int j=1;j<student.length;j++){
		if(student[i].getId()<student[j].getId())
		{
			Student temp=student[i];
			student[i]=student[j];
			student[j]=temp;
		}
			}
	}
		return student;	
}
	public static Student[] sortName(Student student[])
	{
		for(int i=1;i<student.length;i++){
			for(int j=1;j<student.length;j++){
				int n=student[i].getFirstName().compareTo(student[j].getFirstName());
				if(n<0)
				{
					Student temp=student[i];
					student[i]=student[j];
					student[j]=temp;
				}
			}
		}
		return student;
	}
	public static Student[] search(Student student[])
	{
		System.out.println("Enter the id");
		int key=s.nextInt();
		for(int i=1;i<student.length;i++){
			if(key==(student[i].getId()))
			{
		
				System.out.println(key);
			break;
			}	
		}
		return student;
	}
	}
