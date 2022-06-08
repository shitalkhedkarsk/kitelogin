package collection_study;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_study {

	public static void main(String[] args) {
//	{
//		TreeSet<String> t=new TreeSet<>();
//		t.add("velocity");
//		t.add("shital");
//		t.add("student");
//		System.out.println(t);
//		//2.methods
//		System.out.println(t.size());
//		System.out.println(t.isEmpty());
//		System.out.println(t.last());
//		System.out.println(t.pollLast());
//		System.out.println(t.pollFirst());
//		//3.for each loop
//		System.out.println("333333333");
//		for(String s:t) 
//		{
//			System.out.println(s);
//		}
//		//4.iterator
//		System.out.println("444444444444444");
//		Iterator<String> is = t.iterator();
//		while(is.hasNext()) 
//		{
//			System.out.println(is.next());
//		}
//		
	
		TreeSet<Integer> t= new TreeSet<>();
		t.add(5);
		t.add(2);
		t.add(0);
		t.add(7);
		System.out.println(t);
		//for each loop
		System.out.println("1111111111111");
		for(Integer i:t)
		{
			System.out.println(i);
		}
		System.out.println("1111111111111");
		//iterator
		Iterator<Integer> is = t.iterator();
		while(is.hasNext())
		{
			System.out.println(is.next());
		}
		
		TreeSet<Character>c=new TreeSet<>();
		c.add('a');
		c.add('v');
		c.add('q');
		c.add('d');
		c.add('y');
		System.out.println(c);
		//for each loop
		for(Character x:c) 
		{
		System.out.println(x);	
		}
		//iterator
		System.out.println("=====iiiiii");
		Iterator<Character> as = c.iterator();
		while(as.hasNext())
		{
			System.out.println(as.next());
		}
		
		
		
		
		
		
		
		
	}

}
