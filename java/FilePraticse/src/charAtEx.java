
public class charAtEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello how are khhkjkhkllu";
	
		int counter=0;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='h')
			{
				counter++;
			}
			
		}
		System.out.println("occurance of h is  "+counter );
	}

}
