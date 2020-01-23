package filehandling;
import java.util.*;


public class filecreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Formatter x;
		try {
			x=new Formatter("test.txt");
			System.out.print("new file created");
		}
		catch(Exception e){
			System.out.println("you got an error");
			
		}
		
		
	}

}
