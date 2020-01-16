package lamdaexpression;
//generic functional interface
interface somefunc<T>{
	T func(T t);
}

public class genericfuncinter {
	public static void main(String args[]) {
		
		
		//use a string based version of somefunc
		
		somefunc<String> reverse = (str)-> {
			String result ="";
			int i;
			for(i=str.length()-1 ; i>=0 ; i--) {
				result+=str.charAt(i);
				
				
			}
			return result ;
		};
		
		System.out.println("lambda reverse is "+reverse.func("lambda"));
		
		//now , use a integer based versuion of some function 
		
		somefunc<Integer> fact = (n)->{
			int result=1;
			for(int i=1 ; i<=n ; i++) {
				result=result*i;
			}
			return result;
		};
		System.out.println("the dactorial of 3 is "+ fact.func(3));
	}
}
