package logical_prgm;

import java.util.Scanner;

public class No_palindrome {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter no ");
			int originalNum = sc.nextInt();
			int revNum;
			String oriString = Integer.toString(originalNum);
			String revString = " ";
			for(int i=oriString.length()-1;i>=0;i--)
			{
				revString=revString+oriString.charAt(i);
					}
			revNum = Integer.parseInt(revString);
			System.out.println("num is "+revNum);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
