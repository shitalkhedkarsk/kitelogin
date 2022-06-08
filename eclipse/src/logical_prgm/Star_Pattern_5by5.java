package logical_prgm;

public class Star_Pattern_5by5 {

	public static void main(String[] args)
	{
		//1.vertical five * will print
//		for(int  i=1;i<=5;i++)
//		{
//			System.out.println("*");
//		}
		//1.horizontal five * will print
		/*for(int  i=1;i<=5;i++)
		{
			System.out.print("*");
		}*/
		
		//******				//* * * * * 
		//******				//* * * * * 
		//******				//* * * * * 
		//******				//* * * * * 
		//******				//* * * * * 	
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++) //for column for loop
			{
				System.out.print("* ");
			}
			System.out.println(); //for new line println
		}*/
		/* start triangle
		 * 	
		 * *
		 * * *
		 * * * *
		 * * * * *
		end */
	/*	int space=4;
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
				for(int k=1;k<=space;k++)
				{
				System.out.print(" ");
				}
			
			System.out.println();
			star++;
			space--;
		}*/
		//revere star
/*		* * * * *
		* * * *
		* * *
		* *
		*
*/		
	/*	int star=5;
		int space=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			for(int k=1; k<=space; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			space++;
			star--;
		} */
		
/*		      *
		    * *
		  * * *
		* * * *
	  * * * * *
*/		
/*		int star=1;
		int space=4;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
			
		}*/
/*
 	  * * * * * * *
 		* * * * *
 		  * * *
 		    *
 */
		//we are having 4=row
		 //             7=column
		//space decrease by one from any one side and star increase by 2 
		
		
/*		int star=7;
		int space=0;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;
		}      */
		/*
		 		  *
		 		* * *
		 	  * * * * *
		 	* *	* * * * *
		 */
		int star=1;
		int space=3;
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
			star=star+2;
			space--;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
