package Basic;
import java.util.*;

public class exceptionhandle {
	
	public static void main(String[] args) {
		int x=1;
		Scanner	sc=new Scanner(System.in);
	
	do {	
		
		try {
		
		System.out.println("enter first no");
		int n1 = sc.nextInt();
		System.out.println("enter the second number");
		int n2 = sc.nextInt();
		int divide = n1/n2;
		System.out.printf("\n total is %d",divide);
		x=2;
		}
		catch(Exception e)
		{
			System.out.println("unable to operate");
		}
		
	}while(x==1);
	
	
	sc.close();
	}

}
