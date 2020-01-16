package Basic;

public class toStringmethod {
	
	private int day;
	private int month;
	private int year;
	
	toStringmethod(int d, int m , int y) {
		
		day=d;
		month=m;
		year=y;
		
		System.out.printf("the constructor for this is %s\t ",this);
		
	}
	
	public String toString() {
		return String.format("%d/%d/%d",day,month,year);
		
	}
	
	public static void main(String args[])
	{
	toStringmethod t=new toStringmethod(10,10,10);
	
	}
}
