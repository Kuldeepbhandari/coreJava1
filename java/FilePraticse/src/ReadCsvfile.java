import java.io.BufferedReader;
import java.io.FileReader;


public class ReadCsvfile {
public static void main(String[] args) {
	try
	{
		String csvFile="Sample.csv";
		BufferedReader br=new BufferedReader(new FileReader(csvFile));
		String line=" ";
		int lineNumber=0;
		while((line = br.readLine())!=null)
		{
			lineNumber++;
			String st[]=line.split(",");
			System.out.println(st[0]+" "+ st[1]+" "+st[2]);
		}
		
	}catch(Exception e)
	{
		System.out.println("csv file is not read"+e);
	}
}
}