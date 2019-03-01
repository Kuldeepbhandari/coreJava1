import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;


public class ArrayByteEx {
public static void main(String[] args) throws FileNotFoundException {
	String len="hello how are u everyone";
	byte bb[]=len.getBytes();
	FileOutputStream s=new FileOutputStream("hello1.txt",true);
	try {
		s.write(bb);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
