package selenim_prac;

import java.io.InputStream;
import java.util.Scanner;

public class April_26_prac {
	

	public static void main(String[] args) 
	{
		//palindrome
//		int a=123;
//		int digit=a;
//		int rev=0,rem=0;
//		while(digit!=0)
//		{
//		rem=digit%10;
//		rev=rev*10+rem;
//		digit=digit/10;
//		}
//		if(rev==a)
//		{
//		System.out.println(a+" No is palindrome.. "+rev);
//		}
//		else{
//		System.out.println(a+" No is not palindrome.. "+rev);
//		}
		
		//Armstrong no
		//123=1^3+2^3+3^3=123int a=121;
//		

		
		//prime no
//		int n=90;
//		int count=0;
//		for(int a=2;a<n;a++)
//		{
//		int no=n%a;
//		if(no==0)
//		{
//		count++;
//		}}
//		if(count==1)
//		{
//		System.out.println(n+" is prime no");
//		}
//		else
//		{
//		System.out.println(n+" is not prime no");
//		}
		
		//fibonacci
		//0 1 1 2 3 5 8 13 ....
//		int a=0;
//		int b=1;
//		for(int n=0;n<=13;n++)
//		{
//		int c=a+b;
//		System.out.print(c+" ");
//
//		a=b;
//		b=c;
//		}
		
		
		//factorial
		//5 factorial=1*2*3*4*5
//		int a=6;
//		int fact=1;
//		for(int i=1;i<=a;i++)
//		{
//		fact=fact*i;
//		}
//		System.out.println("factorial of "+a+"is "+fact);


		//even odd no
//		int a=15;
//		if(a%2==0)
//		{
//		System.out.println(a+" no is even no");
//		}
//		else
//		{
//		System.out.println(a+" no is odd no");
//		}
//		
		
//		String a="nitin";
//		String b=" ";
//		for(int i=a.length()-1;i>=0;i--)
//		{
//		b=b+a.charAt(i);
//
//		}
//		//System.out.println(" Reverse string of "+a+" is"+b);
//		
//		if(a==b)
//		{
//			System.out.println("String is Palindrome");
//		}

		
		//reverse string
//		String ip="shital hello good morning";
//		String op=" ";
//		String[] sp = ip.split(ip);
//		for(int i=0;i<=sp.length-1;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(sp);
//			}
//			else
//			{
//				String str = sp[i];
//				revstring(str);
//			}
//		}
//		public static revstring(String inp)
//		{
//		for(int i=ip.length()-1;i>=0;i--)
//		{
//		
//		op=op+ip.charAt(i);
//		}
//		System.out.println(op);
//		}
//		
		
		
		//star pattern
		
//		int star=1;
//		for(int i=1;i<=5;i++)
//		{
//
//		for(int j=1;j<=star;j++)
//		{
//		System.out.print("* ");
//		}
//		
//		System.out.println(" ");
//		star++;
//		
		//}
		//
//		int star=5;
//		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print("* ");
//			}
//		
//		System.out.println(" ");
//		star--;
//		}
		
		
//			int star=1;
//			int space=4;
//		   for(int i=1;i<=5;i++)
//		    {
//			for(int k=1;k<=space;k++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print("*");
//			}
//		
//		System.out.println();
//		star=star+2;
//		space--;
//		}
		
		
		
		
		
		
		
		
		
		int star=5;
		int space=0;
	   for(int i=1;i<=5;i++)
	    {
		   
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
	
	System.out.println();
	star=star-2;
	space++;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}