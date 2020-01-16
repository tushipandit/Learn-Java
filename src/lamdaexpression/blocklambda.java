package lamdaexpression;

interface numericfunc{
	int func(int n);
	
}

public class blocklambda {
	public static void main(String args[]) {
		numericfunc factorial = (n) -> {
			int result = 1;
			for(int i=1; i<=n ;i++) {
				result = i * result;
			}
			
		return result;
		};
		
		System.out.println("the factorial of 3 is "+factorial.func(3));
		
		
	}
}
