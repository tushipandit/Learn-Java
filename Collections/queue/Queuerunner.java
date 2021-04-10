package queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}

	
	
}

public class Queuerunner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new PriorityQueue<>( new StringLengthComparator());
		
		queue.offer("Monkey");
		
		queue.addAll(List.of("Dog" , "Pussy" ,"Kitty"));
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		queue.offer("Monkey");
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		
	}

}
