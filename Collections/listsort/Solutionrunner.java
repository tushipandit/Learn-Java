package listsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class AsscendingstudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}
public class Solutionrunner {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = List.of(new Student(1,"Ranga")
				,new Student(3,"happy") 
				,new Student(2,"shmpy"));
		
		System.out.println(students);
		
		ArrayList<Student> studentsAL = new ArrayList<Student>(students);
		
		//Collections.sort(studentsAL);
		System.out.println(studentsAL);
		
		studentsAL.sort(new AsscendingstudentComparator());
		
		System.out.println(studentsAL);
		
		
	}

}
