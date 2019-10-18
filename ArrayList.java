public class ArrayList<T> implements List<T>
{
	private int DEFSIZE=10;
	private T[] array;
	private int size=0;
	public ArrayList()
	{
		array=(T[]) new Object[DEFSIZE];
	}
	public void growArray()
	{
		T temp[]=(T[]) new Object[array.length*2];
		for (int x=0;x<array.length;x++)
		{
			temp[x]=array[x];
		}
		array=temp;
	}
	public void add(T item)
	{
		if(size==array.length&&size>0)
			growArray();
		array[size]=item;
		size++;
	}
	public void add(int pos, T item)
	{
		T temp=item;
		T temp2;
		size++;
		int lim=size-pos;
		int start=pos;
		for(int x=start;x<lim;x++)
		{
			if(pos==size)
				growArray();
			if(array[pos]==null)
			{
				array[pos]=temp;
				continue;
			}
			temp2=array[pos];
			array[pos]=temp;
			temp=temp2;
			pos++;
		}

	}
	public T get(int pos)
	{
		return array[pos];

	}
	public T remove(int pos)
	{
		int y=0;
		int re=0;
		T temp[]=(T[]) new Object[array.length-1];
		T array2[]=(T[]) new Object[array.length-1];
		for (int x=0;x<array.length;x++)
		{
			if(x!=pos)
			{
				temp[y]=array[x];
			}
			else if (x==pos)
			{
				re=x;
			}			
		}
		array2=array;
		array=temp;
		T result=array2[re];
		size--;
		return result;
	}
	public int size()
	{
		return size;
	}

}