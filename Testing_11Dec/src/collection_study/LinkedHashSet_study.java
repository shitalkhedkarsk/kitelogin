package collection_study;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_study {

	public static void main(String[] args) 
	{
		//1.create LinkedHashSet
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		lh.add(1);
		lh.add(7);
		lh.add(2);
		lh.add(0);
		lh.add(null);
		lh.add(2);
		lh.add(7);
		System.out.println(lh);
		//2.method
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
		//3.for each loop
		for(Integer i:lh)
		{
			System.out.println(i);
		}
		System.out.println("=============");
		//4.iterator
		Iterator<Integer> k = lh.iterator();
		while(k.hasNext())
		{
			System.out.println(k.next());
		}
		
		
		
		

	}

}
