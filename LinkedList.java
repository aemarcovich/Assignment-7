public class LinkedList<T> implements List<T>
{
	private int size;
	private Node head;
	public LinkedList()
	{
		size=0;
		head=null;
	}
	static class Node
	{
		T data; 
		Node next;
		Node(T i)
		{
			data=i;
			next=null;
		}
	}
	public void add(T item)
	{
		if(head==null)
			head= new Node(item);
		else
		{
			Node currrent=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=new Node(item);
		}
		size++;
	}
	public void add(int pos, T item)
	{
		if(pos==0)
		{
			Node add =new Node(item);
			add.next=head;
			head =add;
		}
		else
		{
			Node prev = head;
			for(int x=0;x<pos-1;x++)
			{
				prev=prev.next;
			}
			Node n = new Node(item);
			n.next=prev.next;
			prev.next=n;
		}
		size++;
	}
	public T get(int pos)
	{
		Node get =head;
		for (int x=0;x<pos;x++)
		{
			get=get.next;
		}
		return n.data;
	}
	public T remove(int pos)
	{
		if(pos==0)
		{
			Node current=head;
			head=head.next;
			size--;
			return current.data();
		}
		else{
			Node prev =head;
			for (int x=0;x<pos-1;x++)
			{
				prev=prev.next;
			}
			Node current =prev.next;
			prev.next=current.next;
			size--;
		}
	}
	public int size()
	{
		return size;
	}
}