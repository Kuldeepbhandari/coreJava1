import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WriteFile {
	
	public static void main(String str[]) throws IOException
	{
		/*try
		{
			FileWriter file=new FileWriter("hello1.txt",true);
			BufferedWriter bufferedWriter=new BufferedWriter(file);
			Scanner scanner=new Scanner(System.in);
			String data=null;
			while((data=scanner.nextLine())!=null)
			{
				bufferedWriter.write(data);
				bufferedWriter.newLine();
                     bufferedWriter.flush();
			}
		}
		catch (Exception e) {
		e.printStackTrace();
		}*/
		File f=new File("hell.txt");
		//f.createNewFile("hello.txt");
		WriteFile.writeFile("hell.txt","hello whyy");
		
		
	}
	public static void writeFile(String fileName,String data) throws IOException
	{
		FileWriter fw=new FileWriter(fileName);
		fw.write(data);
		fw.flush();
		fw.close();
	}

}


