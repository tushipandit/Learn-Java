package polymorphism;

public class child {

	public static void main(String[] args) {
			root start[] = new root[2]; //create root class array type object 
			start[0]=new father();	//Reference to the child class father
			start[1]=new mother();	//refernce to the child class mother
			
			
			for(int i=0 ; i<2 ; i++) {
				start[i].pos();	//call overided methods
			}
			
			

	}

}
