package logical_prgm;

public class Diamond_star {

	public static void main(String[] args) 
	{
		int star=7;
		int space=0;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;

	}
		int star1=3;
		int space1=2;
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=space1; j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star1=star1+2;
			space1--;
		}
		}
}
