package maps;

import java.util.HashMap;
import java.util.Map;

public class Maprunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="welcome to the new class how you doing lets"+
						"pllay holly";
		
	    Map<Character , Integer> characteroccurence = new HashMap<>();
		
		char[] chars=str.toCharArray();
		
		for(char cha:chars)
		{
			Integer integer= characteroccurence.get(cha);
			if( integer == null)
			{
				characteroccurence.put(cha, 1);
			}
			else
			{
				characteroccurence.put(cha, integer+1);
			}
			
		}
		
		System.out.println(characteroccurence);
		
		
		
		   Map<String , Integer> wordoccurence = new HashMap<>();
			
			String[] words=str.split(" ");
			
			for(String wo:words)
			{
				Integer integer= wordoccurence.get(wo);
				if( integer == null)
				{
					wordoccurence.put(wo, 1);
				}
				else
				{
					wordoccurence.put(wo, integer+1);
				}
				
			}
			
			System.out.println(wordoccurence);
		
		
		
		
	}

}
