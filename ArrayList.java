//Alejandro Marcovich
public class ArrayList<T> implements List<T>
{
	private int DEFSIZE=10;
	private T[] array;
	private int size=0;
	public ArrayList()
	{
		array=(T[]) new Object[DEFSIZE];
	}
	//function grows the Array.
	public void growArray()
	{
		T temp[]=(T[]) new Object[array.length*2];
		for (int x=0;x<array.length;x++)
		{
			temp[x]=array[x];
		}
		array=temp;
	}
	//function adds to the end of the array.
	public void add(T item)
	{
		if(size==array.length&&size>0)
			growArray();
		array[size]=item;
		size++;
	}
	//This function adds to a specific position.
	//It Start from the back grows when array is full.
	//than changes the value to that of the previous
	//poaition,
	public void add(int pos, T item)
	{
		if(array.length==size)
			growArray();
		for(int x=size;x>pos;x--)
		{
			array[x]=array[x-1];
		}
		array[pos]=item;
		size++;
	}
	//get the value in the array.
	public T get(int pos)
	{
		return array[pos];

	}
	//remove item from array. Works like add except
	// remove the pos postion by making it the following
	//array value.
	public T remove(int pos)
	{
		T item=array[pos];
		for(int x=pos;x<size-1;x++)
			array[x]=array[x+1];
		size--;
		return item;
	}
	//returns size.
	public int size()
	{
		return size;
	}

}