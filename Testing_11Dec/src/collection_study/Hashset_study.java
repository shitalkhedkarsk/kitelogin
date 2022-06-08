package collection_study;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_study {

	public static void main(String[] args)
	{
		//create Hashset
		HashSet<Object> st=new HashSet<>();
		st.add("velocity");
		st.add(123);
		st.add(123);
		st.add(null);
		st.add(null);
		st.add('A');
		System.out.println(st);//takes random sequence
		//2.different methods of hashset
		System.out.println(st.clone());
		System.out.println(st.contains(123));
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		//3.for each loop
		for(Object o:st)
		{
			System.out.println(o);
		}
		System.out.println("===============");
		//Iterator
		Iterator<Object> i = st.iterator();
		while(i.hasNext())
		{	
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
	}


}
