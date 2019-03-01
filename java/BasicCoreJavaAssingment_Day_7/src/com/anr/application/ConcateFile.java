package com.anr.application;

import java.io.File;

import com.anr.util.ReadFile;

public class ConcateFile {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		String data="";
		File f=new File(args[args.length-1]);
		try
		{
			f.createNewFile();
			for(int i=0;i<args.length;i++){
				if(f.length()<args.length)
				{
				data=ReadFile.readFile(args[i], data);
				sb.append(data);	
			}
			System.out.println(sb);
			String str1=sb.toString();
			ReadFile.readFile(args[args.length-1],str1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
