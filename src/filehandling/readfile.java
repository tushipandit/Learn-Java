package filehandling;
import java.util.*;
import java.io.*;

public class readfile {
	
	private Scanner x;
	public void openfile() {
		try {
			x=new Scanner(new File("test.txt"));
		}catch(Exception e) {
			System.out.println("colud not find files");
		}
	}
	
	public void readfile() {
		while(x.hasNext()) {
			String a=x.next();
			String b=x.next();
			String c=x.next();
			System.out.printf("%s %s %s", a,b,c);
		}
	}
	
	public void closefile() {
		x.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readfile r =new readfile();
		r.openfile();
		r.readfile();
		r.closefile();
	}
	
}
