package selenim_prac;

public class Prime2 {

	public static void main(String[] args) {
		int a=33;
		int p=0;
		for(int i=2;i<a;i++)
		{
			int c=a%i;
			if(c==0)
			{
				System.out.println(a +" not prime no");
				p=1;
				break;
			}
		}
		if(p==0)
			{
				System.out.println(a+" prime no");
			}
		

	}

}
