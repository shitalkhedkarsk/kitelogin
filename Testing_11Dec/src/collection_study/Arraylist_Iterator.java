package collection_study;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Iterator {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();//create arraylist of integer type
		al.add(23);
		al.add(54);
		al.add(56);
		al.add(87);
		System.out.println(al);
		System.out.println("=====================");
		
		
		
		
		
		
		
		//iterator
		Iterator<Integer> il=al.iterator();
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
		System.out.println("=====================");
		//for each loop
		for(Integer o:al)
		{
			System.out.println(o);
		}

	}

}
