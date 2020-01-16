package lamdaexpression;

//Demonstrate a lambda expression that takes parameter

interface Numerictest{
	boolean test(int n);
}

public class lambdademo2 {

	public static void main(String args[]) {
		Numerictest iseven = (n) -> n%2==0 ;
		if(iseven.test(10)) System.out.println("10 is even");
		if(iseven.test(9)) System.out.println("9 is odd");
		
		
		Numerictest isnonneg = (n) -> n>=0;
		if(isnonneg.test(1)) System.out.println(" 1 is non neg");
		if(isnonneg.test(-1)) System.out.println("-1 is negative");
		
	}
	
}
