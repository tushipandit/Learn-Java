package listsort;

public class Student implements Comparable<Student>{
	private int id;
	private String Name;
	public Student(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String toString()
	{
		return id+" "+ Name;
	}
	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, that.id);
	}
	
	
	
}
