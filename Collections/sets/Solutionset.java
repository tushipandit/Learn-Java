package sets;

import java.util.HashSet;
import java.util.Set;

public class Solutionset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Set is a collection of objcts
		 * no repition of values are allowed
		 * 
		 * Set is immutable type
		 * 
		 * HashSet is mutable 
		 * 
		 * 
		 */
		
		
		Set<String> set = Set.of("apple" , "banana" , "orange");
		System.out.println(set);
		
		Set<String> hashset = new HashSet<String>(set);
		//Similar type of value is not inserted into set
		try {
		hashset.add("apple");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		System.out.println(hashset);
		
		
		
		
		
		
		
		
		
	}

}
