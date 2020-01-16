package enumeration;

public enum people {
	
	pritika("cute","1"),
	rohini("fatty","2"),
	swiza("duck","3"),
	suhana("sexy","4");
	
	public final String desc;
	public final String age;
	
	people(String description , String birthday) {
		desc=description;
		age= birthday;
	}
	
	public String getdesc()
	{
		return desc;
	}
	public String getage()
	{
		return age;
	}

}
