package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Variouslists {
		/*
		 * 
		 * 
		 * List types-
		 * 
		 * List is immutable
		 * whereas below are mutable types
		 * arraylist - arraylist is of type arrrays
		 * linkedlist - linkedlist are if linkedlist type 
		 * vectors --vectors are of array type but have thread safety
		 * 
		 * 
		 * */
	public static void main(String args[])
	{
		
		
		List<String> words = List.of("ram" , "sham" , "mohan" , "maan");
		
		List<Integer> numbers = List.of(10 , 2 ,3 ,14 , 9);
		//int are automatically converted into their respective wrapper class this is called autoboxing.
		
		
		List<Integer> numberAL = new ArrayList<Integer>(numbers);
		
		List<String> wordsLL = new LinkedList<>(words);
		
		List<String> wordsv = new Vector<>(words);
		
		System.out.println(words);
		System.out.println(numberAL);
		System.out.println(wordsLL);
		System.out.println(wordsv);
		
		//words.add("happy"); this is not allowed as it is immutable List so this throws error
		
		numberAL.add(5);
		
		//copy values are added
		numberAL.add(2); 
		
		System.out.println(numberAL);
		
		
		//adding values at specific position
		numberAL.add(1,4); 
		wordsLL.add(2,"happy");
		
		System.out.println(numberAL);
		System.out.println(wordsLL);
		
		//get elements
		System.out.println( numberAL.get(4) );
		System.out.println( wordsLL.get(2)  );
		
		List<String> d1=List.of("apple" ,"mango" , "peach", "orange");
		List<String> d2AL=new ArrayList<>();
		d2AL.addAll(d1);
		System.out.println(d2AL);
		
		wordsLL.set(2, "fish");
		System.out.println(wordsLL);
		
		//remove elements
		numberAL.remove(2);
		System.out.println(numberAL);
		
		wordsLL.remove("ram");
		System.out.println(wordsLL);
		
		//size of the list
		System.out.println(wordsLL.size());
		
		//Iteration over list
		
		for(int i=0 ; i<wordsLL.size();i++)
		{
			System.out.println(wordsLL.get(i));
		}
		
		for(int x:numberAL)
		{
			System.out.println(x);
		}
		
		Iterator<String> it =wordsLL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		/*
		 * Iterator is used where any modification happens between the list during iteration
		 */
		List<String> nl = List.of("cat","bat" , "dog" ,"insect");
		List<String> wAL= new ArrayList<String>(nl);
		
		System.out.println( nl.indexOf("bat") );
		
		//it gives us concurrent exception so this is not possible so we have to use iterator
		try {
		for(String lo : wAL)
		{
			if(lo.endsWith("at"))
			{
				wAL.remove(lo);	
			}
			
		}
		
		System.out.println(wAL);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		Iterator<String> it1 =wAL.iterator();
		while(it1.hasNext())
		{
			if(it1.next().endsWith("at"))
			{
				it1.remove();
			}
		}
		System.out.println(wAL);
			
		
		List value=List.of(1,"hello",1.0,2,'a');
		List AL1=new ArrayList(value);
		System.out.println( AL1.get(1) instanceof String );
		System.out.println( AL1.get(2) instanceof Double );
		System.out.println( AL1.get(4) instanceof Character );
		
		List num2=List.of(1 , 12 , 14 , 2 , 4);
		List<Integer> AL12=new ArrayList<>(num2);
		
		Collections.sort(AL12);
		System.out.println(AL12);
		
		
		
	}
	
}
