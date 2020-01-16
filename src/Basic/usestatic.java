package Basic;

public class usestatic {
	
	
	private String name;
	private String surname;
	private static int members=0; //variables shared by all objects
	private final int value;
	
	usestatic()
	{
		value=10;
	}
	
   public void usestat(String nm , String sn){
		name=nm;
		surname=sn;
		members++;
		System.out.printf("the first name is %s\n and the surname is %s\n and the total member is %d \n",name,surname,members);
	}
   
   public String getname()
   {
	   return name;
   }
   public String getlast()
   {
	   return surname;
   }
   public static int getmem()
   {
	return members;   
   }
   
   public static void main(String srgs[])
   {
	   usestatic m1=new usestatic();
	   usestatic m2=new usestatic();
	   usestatic m3=new usestatic();
	   m1.usestat("tushar","sharma");
	   m2.usestat("vishal","verma");
	   m3.usestat("rohan","kapoor");
	   
	   System.out.println("name is"+m1.getname());
	   System.out.println("last is"+m1.getlast());
	   System.out.println("member is"+m1.getmem());
	   
	  System.out.println(usestatic.getmem());
	  
	  System.out.println(m1.value);
	  
	
   }
	
}
