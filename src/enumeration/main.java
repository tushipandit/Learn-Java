package enumeration;

import java.util.EnumSet;

public class main {

	public static void main(String[] args) {
		for(people person : people.values())
		{
			System.out.printf("\t%s\t%s\t%s\n", person ,person.getdesc(),person.getage());
		
		}
		System.out.println("now range of constants");
		
		for(people person : EnumSet.range(people.pritika, people.swiza))
		{
			System.out.printf("\t%s\t%s\t%s\n", person ,person.getdesc(),person.getage());
			
		}	
		
	}

}
