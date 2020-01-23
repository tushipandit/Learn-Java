package filehandling;
import java.io.*;


public class usefileclass {

	public static void main(String[] args) {
		
		File x = new File("/home/tusharsharma/tushi-work/projects/Learn-Java/test.txt");
		if(x.exists())
		{
			System.out.println(x.getName()+"exsisits");
		}
		else
		{
			System.out.println("this thing dosent exsists");
		}
	}

}
