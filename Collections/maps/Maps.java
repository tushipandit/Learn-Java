package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Maps {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Map is a collection without implementing collections
		 * It is of immutable type
		 * 
		 */
		Map<String,Integer> map=Map.of("A",1,"B",2,"C",3);
		System.out.println(map);
		
		System.out.println( map.get("B") );
		
		System.out.println( map.size());
		System.out.println(map.isEmpty());
		
		System.out.println( map.containsKey("B"));
		
		System.out.println( map.containsValue(2));
		System.out.println( map.keySet());
		System.out.println( map.values());
		
		
		/*
		 * HashMap : Insertion oder and sorted oder dosen't matter
		 * 
		 * LinkedHashMap : Insertion oder matter whereas sorted oder dosen't matter
		 * 
		 * TreeMap : Insertion oder and sorted oder both matters
		 */
		
		Map<String,Integer> hashmap = new HashMap<>(map);
		
		System.out.println( hashmap.put("E", 5) ); //returns the previous key value
		System.out.println( hashmap.put("A", 2));
		
		System.out.println( hashmap);
		
		HashMap<String, Integer> hash=new HashMap<>();
		hash.put("L", 5);
		hash.put("A", 25);
		hash.put("N" , 45);
		hash.put("D", 10);
		
		System.out.println(hash);
		
		LinkedHashMap<String , Integer> lhash = new LinkedHashMap<>();
		
		lhash.put("L", 5);
		lhash.put("A", 25);
		lhash.put("N" , 45);
		lhash.put("D", 10);
		System.out.println(lhash);
		
		TreeMap<String , Integer> Tmap = new TreeMap<>();
		
		Tmap.put("L", 5);
		Tmap.put("A", 25);
		Tmap.put("N" , 45);
		Tmap.put("D", 10);
		
		System.out.println( Tmap);
		
		System.out.println( Tmap.subMap("A", "D") );
		
		System.out.println( Tmap.subMap("A",true, "D",true));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
