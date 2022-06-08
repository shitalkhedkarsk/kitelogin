package logical_prgm;

import java.util.Scanner;

public class String_programm {

	public static void main(String[] args) 
	{
//		String s="Shital";
//		String a=" ";
//		System.out.println(s);
//		System.out.println("String is blank..."+a);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value ");
		String ipString = sc.next();
		System.out.println(ipString);
		String opString=" ";
		for(int i=ipString.length()-1;i>=0;i--)
		{
			opString=opString+ipString.charAt(i);
			
		}
		System.out.println("Reverese string is "+opString);
		
	}

}
