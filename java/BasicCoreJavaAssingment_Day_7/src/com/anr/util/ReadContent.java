package com.anr.util;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadContent {

	public static String readContent(String fName) throws IOException
	{
		
		FileInputStream file=new FileInputStream(fName);
		byte b[]=new byte[file.available()];
		file.read(b);
		return new String(b);
		
		
		/*File f=new File(fName);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		//StringBuffer sb=new StringBuffer();
		while((line=br.readLine())!=null)
		{
			line=br.readLine();
	}
		System.out.println(line);
		
		return line;*/
		
		}
		
	}


