package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class filetoarray {

	public static void main(String[] args) {
		
		int[] values=new int[12];
		int i=0;
		File file=new File("/basic/src/collections/demo");
		if(file.exists()) {
			try {
				Scanner input = new Scanner(file);
				while(input.hasNext() && i < values.length) {
					values[i]=input.nextInt(i);
					input.close();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		for(i=0;i<values.length;i++) {	
		System.out.println(values[i]);
		}
	}
	}

}
