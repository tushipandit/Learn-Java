package filehandling;
import java.io.*;
import java.lang.*;
import java.util.*;

public class writefile {

	private Formatter x;
	
	public void openFile() {
		try {
			x = new Formatter("test2");
			
		}catch(Exception e) {
			System.out.println("you have an error");
		}
	}
		
	public void addRecords() {
		x.format("%s%s%s","20","name","class");
	}
	
	public void closeFile() {
		x.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writefile w=new writefile();
		w.openFile();
		w.addRecords();
		w.closeFile();
	}

}
