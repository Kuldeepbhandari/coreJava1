package com.anr.application;

import java.io.IOException;

import com.anr.entity.Student;
import com.anr.util.StudentUtil;

public class StudentMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StudentUtil su=new StudentUtil();
		Student ar[]=su.stuDetails();
		/*for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}*/
		/*System.out.println("after sorting the array on id base");
		Student arr1[]=su.sort(ar);
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}*/
		
		/*Student sortName[]=su.sortName(ar);
		for(int i=0;i<sortName.length;i++)
		{
			System.out.println(sortName[i]);
		}*/
		
		/*Student arr2[]=su.search(ar); 
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
			}*/
		
		System.out.println(su.search(ar));
		
	}
}
