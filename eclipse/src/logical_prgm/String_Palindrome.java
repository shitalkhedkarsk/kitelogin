package logical_prgm;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter String value: ");
		String inString = ab.next();
		String opString =" ";
		for(int i=inString.length()-1;i>=0;i--)
		{
			 opString = opString+inString.charAt(i);
		}
		System.out.println("revere string is : "+opString);
		System.out.println("original string is : "+inString);
		if(inString.equals(opString)) 
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
