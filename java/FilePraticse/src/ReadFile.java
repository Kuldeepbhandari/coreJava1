import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile {
public static void main(String[] args) throws IOException {
	String fName;
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the file Name");
	fName=s.nextLine();
	String line=null;
	
	try {
		//StringBuilder sb=new StringBuilder();
		FileReader fr=new FileReader(fName);
		//BufferedReader br=new BufferedReader(fr);
		while((line=fr.read()=!null))
		{
			fr.read("hello1..txt");
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}