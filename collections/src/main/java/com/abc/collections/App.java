package com.abc.collections;
import java.util.ArrayList;
import java.util.Collection;

public class App 
{
    private static final String initialCapacity = null;
	//public static Object initialCapacity;
	public static void main( String[] args )
    {
    	int n;
    	int i;
Collection<Integer>list=new ArrayList<>(initialCapacity:10);
   addNumber(list,n,10);
   addNumber(list,n,2);
   addNumber(list,n,7);
   addNumber(list,n,4);
   addNumber(list,n,6);
   addNumber(list,n,8);
   addNumber(list,n,6);
   printlist(list);
   fetchNumber((ArrayList<Integer>)list,i,5);

    }

	private static boolean addNumber(Collection<Integer> list, int n, int i) {
		list.add(n);
		System.out.println(n+" is has been added to the list.");
		return true;
		
	}
	private static boolean removeNumber(Collection<Integer>list,int n) {
		if(list.contains(n)) {
			list.remove(n);
			System.out.println(n+" is has been removed  to the list.");
			return true;
		}
		else
		{
			System.out.println(n+"is not available in the list");
			return false;
		}
	}
	private static void printlist(Collection<Integer> list) {
		for(int i:list) {
			System.out.println("the elements are:"+i);
		}
	}
	private static int fetchNumber(ArrayList<Integer>list,int i, int j) {
		if(list.get(i)>list.size()) {
			throw new IndexOutOfBoundsException();
		}
		else {
			System.out.println("the item is"+list.get(i));
			return list.get(i);
			
		}
		
		
	}
}
