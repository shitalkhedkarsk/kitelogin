package eclipse_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Collection_study {

	public static void main(String[] args) 
	{
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(80);
//		al.add(12);
//		al.add(85);
//		al.add(32);
//		System.out.println(al);
//		ArrayList<Integer> al2=new ArrayList<Integer>();
//		al2.add(63);
//		al2.add(87);
//		al2.addAll(al);
//		System.out.println(al2);
		
//		String[] s=new String[3];
//		
//		s[0]="scsc";
//		s[1]="qsqwwa";
//		s[2]="kyhynfsa";
//				
//		//convert array into string
//		ArrayList<String> sa=new ArrayList<>(Arrays.asList(s));
//		System.out.println(sa);
		
		
		//array list to hashset
		ArrayList<String> s=new ArrayList<>();
		s.add("shital");
		s.add("kishor");
		s.add("kalyani");
		s.add(null);
		s.add("shital");
		s.add("India");
		s.add(null);
		s.add(null);
		s.add("kishor");
		System.out.println(s);
		
		
		HashSet<String> hs=new HashSet<>(s);
		System.out.println(hs);
		
		
		
		
	}

}
