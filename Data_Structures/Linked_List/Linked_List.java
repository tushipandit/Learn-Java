package Linked_List;

public class Linked_List {

	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	Node head;	//head of list
	
	public static Linked_List insert(Linked_List list, int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last=list.head;
			while(last.next != null) {
				last = last.next;
			}
			
			last.next=new_node;
		}	
		return list;
	}
	public static void printList(Linked_List list)
	{
		Node currNode =list.head;
		
		System.out.println("Linkedlist:");
		
		while(currNode != null)
		{
			System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}	
	}
	public static void main(String args[])
	{
		Linked_List list = new Linked_List();
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		printList(list);	
	}
}
