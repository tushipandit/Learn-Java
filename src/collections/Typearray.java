package collections;

public class Typearray {
		
		public static void main(String args[]) {
		
				String[] name=new String[6];
				int[] num= {10,25,30,40};
				int[] numbers=new int[4];
				numbers[0]=10;
				numbers[2]=20;
				
				
				name[0]="peter";
				name[1]="quill";
				name[2]="gavy";
				
			for(int i=0 ; i<name.length ; i++) {
				System.out.println(name[i]);
			}
			
			for(int val : num) {
				System.out.println(val);
			}
			for(int i=0;i<numbers.length;i++) {
				System.out.println(numbers[i]);
			}
			
			
		}
	

}
