package selenim_prac;

public class Practice_fibonacci {

	public static void main(String[] args) {

//		fibonacci series 
//		0 1 1 2 3 5 
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=13;i++)
		{
		c=a+b;
		System.out.print(c +" ");
		a=b;
		b=c;
		}

	}

}
