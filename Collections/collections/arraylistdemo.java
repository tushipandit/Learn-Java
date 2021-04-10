package collections;

import java.util.ArrayList;
/*
 * Arraylist created with initial size . 
 * when the size is exceeding the collection is automatically enlarged
 * when object are removed , the collection automatically shrink
 */

public class arraylistdemo {
	public static void main(String args[]) {
		
		ArrayList<String> names =new ArrayList<>();
		names.add("james");//0
		names.add("peter");//2
		names.add(1,"paul");
		names.set(1,"gavy");//replace at position 1
		
		names.remove(0);
		
		for(int i=0;i < names.size();i++) {
			System.out.println(names.get(i));
		}
		
	}
}
