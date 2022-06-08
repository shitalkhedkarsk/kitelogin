package logical_prgm;

public class Count_space_inString {

	public static void main(String[] args) 
	{
//		String s="shita      l";
//		int count=0;
//		for(int i=0;i<=s.length()-1;i++)
//		{
//			char myChar = s.charAt(i);
//			char b=' ';
//			if(myChar==b)
//			{
//				count++;
//				
//			}
//		}System.out.println(count);
		
		String a="nitin";
		String b = " ";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(b==a)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
	}

}
