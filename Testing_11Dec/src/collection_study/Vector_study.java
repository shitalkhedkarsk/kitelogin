package collection_study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_study {
	
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(54);
		v.add(12);
		v.add(98);
		v.add('A');
		v.add("hello");
		v.add(null);
		v.add(36);
		System.out.println(v);
		System.out.println("========================");
		//1.for loop
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("========================");
		//2.for each loop
		for(Object o:v)
		{
			System.out.println(o);
		}
		System.out.println("===========333=============");
		//3.Iterator
		Iterator<Object> ij=v.iterator();
		while(ij.hasNext())
		{
			System.out.println(ij.next());
		}
		System.out.println("==========444==============");
		//4.Enumeration
		Enumeration<Object> ej=v.elements();
		while(ej.hasMoreElements())
		{
			System.out.println(ej.nextElement());
		}
		
		
		
		
	}
}
