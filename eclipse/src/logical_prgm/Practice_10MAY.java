package logical_prgm;

import org.checkerframework.checker.units.qual.Length;

public class Practice_10MAY {

	public static void main(String[] args) {
		
		//armstrong no

//		int a=371;
//		int digit=a;
//		int rem=0;
//		int arm=0;
//		while(digit!=0)
//		{
//		rem=digit%10;
//		arm=arm+rem*rem*rem;
//		digit=digit /10;
//
//		}
//		if(a==arm)		{
//		System.out.println(a+" is armstrong no");
//		}
//		else
//		{
//		System.out.println(a+" is not a armstrong no");
//		}

//		//palindrome no
//		int a=131;
//		int digit=a;
//		int rem, pali=0;
//		while(digit!=0)
//		{
//		rem=digit%10;
//		pali=pali*10+rem;
//		digit=digit/10;
//		}
//		if(pali==a)
//		{
//		System.out.println(a+" is palindrome no");
//		}
//		else
//		{
//		System.out.println(a+" is not palindrome no");
//		}
//		
		
		//reverse the string 
//		String a="nitin";
//		String rev=" ";
//		for(int i=a.length()-1;i>=0;i--)
//		{
//		rev=rev+a.charAt(i);
//		}
//		System.out.println(rev);
//		if(a.equals(rev))
//		{
//			System.out.println(a+" is a palindrome");
//		}
//		else
//		{
//			System.out.println(a+" is not a palindrome");
//		}

		//occurance of particular charactor
//		String a="nitin is a smart boy";
//		
//		int count=0;
//		char[] c=a.toCharArray();
//		
//		for(char ch:c)
//		{
//			if(ch=='s')
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//		
		//total words present in sentence
//		

		//total no of words
//		String s="hello good morning have a nice day";
//		char[] c=s.toCharArray();
//		int count=0;
//		for(char ch:c)
//		{
//		if(ch==' ')
//		{
//		count++;
//		}
//
//		
//		}
//		System.out.println("total no of words are "+(count+1));
//
//		
		
//		//matching character count
//			String s="hello good morning have a nice day";
//			char[] c=s.toCharArray();
//			int count=0;
//			for(char ch:c)
//			{
//				if(ch=='o')
//				{
//					count++;
//				}
//			}
//			System.out.println("total no of 'o' count are "+count);
//		String sp=s.replaceAll("\\s", "");
//		System.out.println(sp);
//		//reverse string by even no
//		
		
		//star pattern
		
		
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
//		
//		
		
//		int star=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//			star++;
//		}
		
		
//		int star=5;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//			star--;
//		}
		
		
		
//	   *
//	  * *
//   * * *
//  * * * *
// * * * * *
	
//	int star=1;
//	int space=3;
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=1;j<=space;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=star;k++)
//		{
//		System.out.print("*");
//		}
//		System.out.println();
//		star=star+2;
//		space--;
//			
//	}
//		int star=15;
//		int space=0;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=space;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=star;k++)
//			{
//			System.out.print("*");
//			}
//			System.out.println();
//			star=star-2;
//			space++;
//				
//		}
		
//		//fibonacci series

//		int a=0;
//		int b=1;
//		int f;
//		for(int i=1;i<=13;i++)
//		{
//			f=a+b;
//		System.out.print(f+" ");
//		a=b;
//		b=f;
//		}
//		
		//prime no
		
//		int a=9;
//		int count=0;
//		for(int i=2;i<a;i++)
//		{
//			if(a%i==0)
//			{
//				count++;
//				break;
//			}
//		}
//		if(count==1)
//		{
//			System.out.println(a+" is not a prime no");
//		}
//		else
//		{
//			System.out.println(a+" is prime no");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		//reverse string 
////		String name="hello good morning have a nice day";
////		
////		String sep=" ";
////		String[] s=name.split(sep);
////		
////		for(int i=0;i<s.length;i++)	
////		{
////			String rev=" ";
////			for(int j=0;j<s[i].length();j++) 
////			{
////				
////			rev=s[i].charAt(j)+rev;	
////			}
////			System.out.print(rev+" ");
////		}
////		
//		
//		
//		
//		
//		
//	
		
		
		
		
		
		

	}
	
	

}
