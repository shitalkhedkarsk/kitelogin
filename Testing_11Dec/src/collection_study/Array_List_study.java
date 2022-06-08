package collection_study;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_study {

	public static void main(String[] args)
	{
		ArrayList<Object> a=new ArrayList<>();//1.create ArrayList
		//data type is Object because we are storing heterogeneous data
		//ArrayList a=new ArrayList<>();//2.create ArrayList
		a.add("shital");
		a.add("velocity");
		a.add('a');
		a.add(123.321);
		a.add(null);
		a.add('B');
		a.add('B');
		System.out.println(a);
		a.add("velocity");
		a.add(null);
		a.add(350.987);
		a.add('B');
		System.out.println("======2======");
		System.out.println(a);
		System.out.println("======2======");
		a.add(2, "hello everyone");
		System.out.println(a);
		System.out.println("======2======");
		a.remove(2);
		a.remove(4);
		a.remove(8);
		System.out.println(a);
		//to see particular element we are using get method
		System.out.println(a.get(5));
		//to see all elements one by one we are using for loop
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("===============================");
		//using Iterator
		 Iterator al=a.iterator();
		while(al.hasNext()) 
		{
		System.out.println(al.next());	
		}
		
		
		
	}

}
