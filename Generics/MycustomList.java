import java.util.ArrayList;

public class MycustomList<T> {

	ArrayList<T> list = new ArrayList<T>();
	
	public void addElement(T x)
	{
		list.add(x);
	}
	
	public void removeElement(T y)
	{
		list.remove(y);
	}
	
	public String toString()
	{
		return list.toString();
	}
	
	
	public T getIndex(int index)
	{
		return list.get(index);
	}
	
}
