package ada;
import java.util.Scanner;

public class binarysearch {
	int n;
	int s;
	int a[];
	int r;
	
	int search( int[] a, int n , int s){
		int i=1;
		if(i==n) {
			r= n;
		}else if(i+1==n) {
				if(a[0]==s) {
					r= i;
				}else {
					r= i+1;
				}}
				else {
					search( a , n , s);
				}
		
		return r;
	 
	}
	
	
	public static void main(String args[]) {
		
		binarysearch bs = new binarysearch();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of input array");
		bs.n = sc.nextInt();
		System.out.println("enter the elements in the array");
		for(int i=0 ; i<bs.n ; i++) {
			bs.a[i]=sc.nextInt();
			
		}
		
		System.out.println("enter the element to search");
		bs.s=sc.nextInt();
		
		
		
		sc.close();
		
		
	}
	
}
