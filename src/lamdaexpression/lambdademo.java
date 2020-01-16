package lamdaexpression;

//A functional interface
interface MyNumber{
	double getValue();
}


public class lambdademo {
	
	public static void main(String args[]) {
		MyNumber mynum ; 
		mynum = () -> 123.48;
		System.out.println("a fixed values : " + mynum.getValue());
		mynum =() -> Math.random()*100 ; 
		System.out.println("a random value is "+mynum.getValue());
		
	}

}
