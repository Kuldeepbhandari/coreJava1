import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadingFromaTextFile {
public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("hello1.txt");
	BufferedReader in=new BufferedReader(f);
	String line=in.readLine();
	System.out.println(line);
	f.close();
	File f1=new File("hello2.txt");
//	f1.createNewFile();  //to create a new file 
	//boolean b=f1.delete(); //to delete a file 
	File f3=new File("hello1.txt");
	File f4=new File("hello3.txt");
	boolean b=f3.renameTo(f4);
	
	System.out.println(b);
}
}