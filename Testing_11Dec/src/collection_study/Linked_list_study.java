package collection_study;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list_study {

	public static void main(String[] args)
	{
		LinkedList<Object> ll=new LinkedList<>();
		ll.add(12);
		ll.add("hii");
		ll.add(null);
		ll.add(12);
		ll.add(12);
		ll.add('B');
		ll.add('A');
		System.out.println(ll);
		System.out.println("===============");
		//1.for loop
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("===============");
		//2.for each loop
		for(Object o:ll)
		{
			System.out.println(o);
		}
		System.out.println("===============");
		//3.iterator
		Iterator<Object> ill=ll.iterator();
		while(ill.hasNext()) {
			System.out.println(ill.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
