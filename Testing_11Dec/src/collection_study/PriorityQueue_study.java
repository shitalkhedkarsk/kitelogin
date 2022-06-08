package collection_study;

import java.util.PriorityQueue;

public class PriorityQueue_study {

	public static void main(String[] args) 
	{
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("velocity");
		pq.add("shital");
		pq.add("12");
		pq.add("A");
		pq.add("null");
		System.out.println(pq);
		//1.method
		System.out.println(pq.size());
		System.out.println(pq.hashCode());
		System.out.println(pq.offer("56"));
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		
		
		
		
		
		
		
		
		
		
//		//4.for each loop
//		for(String s:pq)
//		{
//			System.out.println(s);
//		}
//		System.out.println("============pq");
//		//5.iterator
//		Iterator<String> is = pq.iterator();
//		while(is.hasNext())
//		{
//			System.out.println(is.next());
//		}
//		
		
		
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println("===============");
//		System.out.println(pq.poll());
//		System.out.println(pq);
		//2 for loop is not possible due to  unavailavle of get() method 
//		for(int i=0;i<=pq.size()-1;i++)
//		{
//			System.out.println(pq.get(i));
//		}

	}

}
