import java.util.ArrayList;
import java.util.List;

public class Genericrunner {

	static <X> X doublevalue(X value)
	{
		return value;
		
	}
	
	static <X extends List> void duplicateValue(X list)
	{
	   list.addAll(list);
	}
	
	
	//upper bound wildcard
	static double sumOfNumberList(List<? extends Number> numbers )
	{
		double sum = 0.0;
		for(Number number : numbers)
		{
			sum=sum+number.doubleValue();
		}
		return sum;
	}
	

	
	//lower bound wildcard
	static void addCoupleOfValues(List< ? super Number> numbers )
	{
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List emptylist =new ArrayList<Number>();
		addCoupleOfValues(emptylist);
		System.out.println(emptylist);
		
		
		
		System.out.println(sumOfNumberList(List.of(1,2,3,4)));
	   System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1)));
	   System.out.println(sumOfNumberList(List.of(1l,2l,3l)));
		
		
		MycustomList<String> list = new MycustomList<String>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		
		System.out.println(list);
		
		MycustomList<Integer> list2 = new MycustomList<Integer>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		
		System.out.println(list2);
		
		ArrayList<Integer> x = new ArrayList<Integer>( List.of(1 , 2 ,3));
		duplicateValue(x);
		System.out.println(x);
		
		
		
	}

}
