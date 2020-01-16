package arrayholdingobject;

public class rootlist {
	
	private root[] list=new root[5];
	private int i=0;
	
	public void add(root r)
	{
		if(i<list.length)
		{
			list[i]=r;
			System.out.println("Branch added at index"+i);
			i++;
		}
		
	}
	

}
