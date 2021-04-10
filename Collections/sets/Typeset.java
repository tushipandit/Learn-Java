package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Typeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * SET is used where we want unique elements
		 * 
		 * HashSet : insertion oder and sorted oder dosen't matter
		 * LinkedHashSet : insertion oder matter but sorted oder dosen't matter
		 * TreeSet : insertion oder and sorted oder matter
		 * 
		 */
		
		Set<Integer> hashset= new HashSet<>();
		hashset.add(123456);
		hashset.add(12345);
		hashset.add(1234);
		hashset.add(12);
		
		System.out.println(hashset);
		
		Set<Integer> linkset = new LinkedHashSet<>();
		linkset.add(123456);
		linkset.add(1234);
		linkset.add(123);
		linkset.add(12);
		
		System.out.println(linkset);
		
		Set<Integer> treeset = new TreeSet<>();
		treeset.add(123456);
		treeset.add(12345);
		treeset.add(123);
		treeset.add(12);
		
		System.out.println(treeset);
		
		//TreeSet only have navigable in implementaion so it have various methods 
		
		TreeSet<Integer> val= new TreeSet<>(Set.of(2,4,12,41,13));
		
		System.out.println(val);
		
		System.out.println( val.floor(12));
		
		System.out.println( val.lower(12));
		
		System.out.println( val.higher(12));
		
		System.out.println( val.ceiling(12));
		
		System.out.println( val.subSet(4, 12));
		
		
		
		
		

	}

}
