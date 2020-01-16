package inheritance;

public class main extends branch {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root b=new root();
		branch b2=new branch(); //method overided in the class 
		branchsub b3=new branchsub();
		b.getstatement();
		b2.getstatement();
		b3.getstatement();
		

	}

}
