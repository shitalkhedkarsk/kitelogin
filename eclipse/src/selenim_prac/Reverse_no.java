package selenim_prac;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value ");
		int ip = sc.nextInt();
		int revnum=0;
		for(int i=ip;i>0;i=i/10)
		{
		System.out.println(i);
			int rem=i%10;
			System.out.println("remender is "+rem);
			revnum=revnum*10+rem;
		}
		System.out.println("reverse no is "+revnum);
	}

}
