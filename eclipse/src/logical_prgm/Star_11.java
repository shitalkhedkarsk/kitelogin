package logical_prgm;

public class Star_11 {

	public static void main(String[] args) 
	{
		int star=8;
		int space = 0;
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
			space++;
			star=star-2;
		}
		int star1=2;
		int space1 = 3;
		for(int i=1;i<=3;i++)
		{
			for(int k=1;k<=space1;k++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			space1--;
			star1=star1+2;
		}

	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

